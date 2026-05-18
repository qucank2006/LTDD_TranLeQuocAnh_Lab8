package com.example.loginsignup

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Signin : Screen("signin")
    object Signup : Screen("signup")
}
