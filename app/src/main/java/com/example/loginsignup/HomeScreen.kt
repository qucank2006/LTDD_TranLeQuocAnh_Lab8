package com.example.loginsignup

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.google.firebase.auth.FirebaseAuth

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize().background(Color(0xFFF1C137)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Chào mừng đến với AURA-MUSIC!", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            FirebaseAuth.getInstance().signOut()
            navController.navigate(Screen.Signin.route) {
                popUpTo(Screen.Home.route) { inclusive = true }
            }
        }) {
            Text("Đăng xuất")
        }
    }
}
