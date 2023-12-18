package com.example.composedemo.ui.theme

sealed class Routes(val routes:String){
    object Login: Routes("Login")
    object SignUp: Routes("SignUp")
    object ForgetPassword: Routes("ForgetPassword")

    object NextScreen : Routes("next_screen/{username}/{password}")
}
