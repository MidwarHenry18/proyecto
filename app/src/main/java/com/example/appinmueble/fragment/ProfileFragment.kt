package com.example.appinmueble.fragment


import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import com.example.appinmueble.R

@Composable
fun ProfileFragment(navController: NavController) {
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()) {
        item {
            Image(
                painter = painterResource(R.drawable.cody),
                contentDescription = "avatar",
                contentScale = ContentScale.Crop,            // crop the image if it's not a square
                modifier = Modifier
                    .size(150.dp)
                    .clip(CircleShape)                       // clip to the circle shape
                    .border(3.dp, MaterialTheme.colors.primary, CircleShape)   // add a border (optional)
            )
            Column(horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(40.dp)) {
                Text(
                    text = "Usuario",
                    textAlign = TextAlign.Start,
                    style = MaterialTheme.typography.h5,
                )

                Text(
                    text = "En Linea",
                    textAlign = TextAlign.Start,
                    style = MaterialTheme.typography.body1,
                    modifier = Modifier
                        .padding(bottom=15.dp)
                )
            }

        }
        item {
            OptionsSHUI(
                navController,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp)
                    .padding(horizontal = 10.dp, vertical = 10.dp)

            )
        }

    }

}
@Composable
fun OptionsSHUI(navController: NavController, modifier: Modifier = Modifier){


    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    Column(
        modifier = Modifier
            .padding()
            .padding(horizontal = 20.dp)
            .padding(top = 20.dp)
    ) {

        Row(
            modifier,
            verticalAlignment = Alignment.CenterVertically
        ){
            Icon(
                painter = painterResource(id = R.drawable.user),
                contentDescription = "",
                tint = Color(0xFF174378),
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(20.dp))
            labelText("Cambiar nombre de usuario")
            Spacer(modifier = Modifier.width(125.dp))


        }
        Row(
            modifier,
            verticalAlignment = Alignment.CenterVertically
        ){
            Icon(
                painter = painterResource(id = R.drawable.recargar),
                contentDescription = "",
                tint = Color(0xFF174378),
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(20.dp))
            labelText("Cambiar contraseña")
            Spacer(modifier = Modifier.width(125.dp))


        }



        val intent = Intent(Intent.ACTION_SENDTO)
        var addresses = listOf("astencionadmin@mail.com").toTypedArray()
        var subject = "Asistencia administrativa"
        intent.setData(Uri.parse("mailto:")) // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, addresses)
        intent.putExtra(Intent.EXTRA_SUBJECT, subject)
        val context = LocalContext.current
        Row(
            modifier.clickable {
                ContextCompat.startActivity(context, intent, null)
            },
            verticalAlignment = Alignment.CenterVertically
        ){
            Icon(
                painter = painterResource(id = R.drawable.ic_mail),
                contentDescription = "",
                tint = Color(0xFF174378),
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(20.dp))
            labelText("Asistencia Técnica")
        }

        Row(
            modifier.clickable {
                navController.navigate("manual_uso")
            },
            verticalAlignment = Alignment.CenterVertically

        ){
            Icon(
                painter = painterResource(id = R.drawable.ic_inst),
                contentDescription = "",
                tint = Color(0xFF174378),
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(20.dp))
            labelText("Instrucciones de uso")

        }

        Row(
            modifier.clickable {
                navController.navigate("politicas_screen")
            },
            verticalAlignment = Alignment.CenterVertically
        ){
            Icon(
                painter = painterResource(id = R.drawable.ic_seg),
                contentDescription = "",
                tint = Color(0xFF174378),
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(20.dp))
            labelText("Politicas de Privacidad")

        }

        Row(
            modifier.clickable {
                navController.popBackStack()

                navController.navigate("login_screen") {
                    popUpTo("login_screen") {
                        inclusive = true
                    }
                }


            },
            verticalAlignment = Alignment.CenterVertically
        ){
            Icon(
                painter = painterResource(id = R.drawable.ic_cesion),
                contentDescription = "",
                tint = Color(0xFF174378),
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(20.dp))
            labelText("Cerrar Sesión")

        }
    }


}
@Composable
fun versionView() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .padding(top = 50.dp)
        ,
        contentAlignment = Alignment.Center
    ) {
        Image(painter = painterResource(id = R.drawable.casa2), contentDescription = "")
        Text(
            text = "",
            fontFamily = FontFamily.SansSerif,
            style = MaterialTheme.typography.subtitle1
        )

    }
}

@Composable
fun LabelledSwitchSetting() {

    val checkedState = remember { mutableStateOf(true) }
    val context = LocalContext.current
    var enable = true
    Switch(
        modifier = Modifier
            .scale(1f),
        checked = checkedState.value,
        onCheckedChange = { checkedState.value = it },
        colors = SwitchDefaults.colors(
            checkedThumbColor = Color(0xFF174378)
        )
    )
    if (checkedState.value){
        enable = true
    }else{
        if (enable){
            enable = false
            Toast
                .makeText(context, "DesHabilitado", Toast.LENGTH_SHORT)
                .show()
        }
    }


}

@Composable
fun labelText(text: String){
    Text(
        text = text,
        fontSize = 23.sp,
        fontFamily = FontFamily.SansSerif,
        style = MaterialTheme.typography.subtitle1
    )
}

@Composable
fun dividerLine(){
    Divider(
        color = Color(0xFF174378),
        modifier = Modifier
            .fillMaxWidth(),
        thickness = 2.dp
    )
}