package com.example.appinmueble.screen


import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavHostController

@Composable
fun politicas(navController: NavHostController) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Politicas de Privacidad", color = Color.White) }, backgroundColor = Color(0xFF174378)) },
        content = { MyContentIfua2() }
    )
}

@Composable
fun MyContentIfua2() {
    val mUrl = "https://www.ferreycorp.com.pe/assets/doc/politica-privacidad.pdf"
    AndroidView(factory = {
        WebView(it).apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            webViewClient = WebViewClient()
            loadUrl(mUrl)
        }
    }, update = {
        it.loadUrl(mUrl)
    })
}
