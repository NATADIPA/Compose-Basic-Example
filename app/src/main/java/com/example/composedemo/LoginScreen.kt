package com.example.composedemo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.composedemo.ui.theme.Routes



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Loginscreen(navController: NavController){

    var username by remember {
        mutableStateOf(TextFieldValue())
    }
    var password by remember {
        mutableStateOf(TextFieldValue())
    }

    var count by remember {
        mutableStateOf(0)
    }

    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){

        Text(text = "Login Screen", style = TextStyle(fontFamily = FontFamily.Serif, fontSize = 40.sp))
        Spacer(modifier = Modifier.height(20.dp))

        TextField(label = { Text(text = "Username")}, value =username , onValueChange = {username=it})
        Spacer(modifier = Modifier.height(20.dp))

        TextField(label = { Text(text = "password")}, value =password , onValueChange = {password=it})

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { navController.navigate(
            Routes.NextScreen.routes + "/${username.text}/${password.text}"
        )}) {
            Text(text = "Click me ")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "$count")

        ClickableText(text = AnnotatedString("Forgetpassword"), onClick ={navController.navigate(Routes.ForgetPassword.routes)} )

        Spacer(modifier = Modifier.height(20.dp))

        ClickableText(text = AnnotatedString("SignUp"), onClick ={} )

    }



}


@Composable
@Preview
fun showPreview(){
    val nav = rememberNavController()
    Loginscreen(nav)
}