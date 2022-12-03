package com.example.appinmueble.component.card

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.fonts.FontFamily
import android.net.Uri
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily.Companion.SansSerif
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.NavController
import com.example.appinmueble.R
import com.example.appinmueble.model.Company
import com.example.appinmueble.screen.Section

@Composable
fun CompanyCard(company:Company,onItemClick:(company:Company)->Unit
) {
    Card(
        modifier = Modifier
            .padding(15.dp)
            .fillMaxWidth()
            .clickable { onItemClick(company) },
        elevation = 5.dp) {
        Column {
            val image:Painter = painterResource(id = company.image)
            Image(painter = image, contentDescription ="",
                modifier = Modifier.height(150.dp).fillMaxWidth(),
                contentScale = ContentScale.Crop)

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween) {
                Column {
                    Text(text = company.name,
                        style = MaterialTheme.typography.h5)

                    Text(text = "Precio S/. ${company.deliveryPrice} . ${company.deliveryTime} ",
                        style = MaterialTheme.typography.subtitle1)
                }

            }
        }
    }

}



