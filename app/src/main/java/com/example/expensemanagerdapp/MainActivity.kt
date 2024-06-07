package com.example.expensemanagerdapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.expensemanagerdapp.navigation.AppNavigation
import com.example.expensemanagerdapp.ui.theme.ExpenseManagerDAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                AppNavigation()
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    ExpenseManagerDAppTheme {
        content()
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApp {
        AppNavigation()
    }
}