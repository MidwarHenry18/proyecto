package com.example.appinmueble.fragment

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.appinmueble.R
import com.example.appinmueble.component.card.TagCard
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.example.appinmueble.model.Company
import com.example.appinmueble.navigation.Screen
import com.example.appinmueble.component.card.CompanyCard
import com.example.appinmueble.model.Category

@Composable
fun CompaniesFragment(navController: NavController) {
    val companies = Company().getCompanies()
    LazyColumn{
        item {
            Text(text = "últimas publicaciones")
            Spacer(modifier = Modifier.padding(10.dp))
            Slides()
            Spacer(modifier = Modifier.padding(10.dp))
            Categories()
        }

        items(companies.size){index->
            CompanyCard(companies[index],
                onItemClick = {
                    navController.navigate("${Screen.DetailsScreen.route}/${index}")
                })
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Slides(){
    val images = listOf(
        R.drawable.publi1,
        R.drawable.publi2,
        R.drawable.publi3,
        R.drawable.publi4,
        R.drawable.publi2
    )
    val pagerState = rememberPagerState()

    HorizontalPager(
        state=pagerState,
        count = images.size,
        modifier = Modifier.height(150.dp)) {
            page ->
        Image(painter = painterResource(id = images[page]), contentDescription ="",
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Crop)
    }
}

@Composable
fun Categories(){

    val categories = Category().getCategories()
    Column {
        Text(text = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp
                )
            ){
                append("¿Estas buscando otra cosa? \n")
            }
            withStyle(
                style = SpanStyle(
                    fontSize = 22.sp
                )
            ){
                append("Buscar categoria")
            }
        },
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.padding(10.dp))
        LazyRow{
            items(categories.size){index->
                TagCard(categories[index].category)
            }
        }
    }
}