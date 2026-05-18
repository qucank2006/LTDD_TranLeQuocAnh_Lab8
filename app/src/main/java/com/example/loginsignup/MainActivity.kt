package com.example.loginsignup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loginsignup.ui.theme.Login_RegisterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Login_RegisterTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Mynavigation()
                }
            }
        }
    }
}

@Composable
fun Mynavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Signin.route) {
        composable(Screen.Signin.route) {
            SignIn(navController)
        }
        composable(Screen.Signup.route) {
            SignUp(navController)
        }
        composable(Screen.Home.route) {
            HomeScreen(navController)
        }
    }
}
