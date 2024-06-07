package com.example.expensemanagerdapp.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.expensemanagerdapp.widgets.CustomElevatedButton
import com.example.expensemanagerdapp.widgets.InputTextField

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Deposit() {
    val green = Color(0xFF3fbf34)
    val greenAccent = Color(0xffddfad7)

    var address by remember {
        mutableStateOf("")
    }
    var amount by remember {
        mutableStateOf("")
    }
    var reason by remember {
        mutableStateOf("")
    }

    Scaffold(containerColor = greenAccent,
        topBar = {
            TopAppBar(
                title = {
                    Box(
                        contentAlignment = Alignment.CenterStart
                    ) {
                        Text(
                            text = "Deposit Details",
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = greenAccent)
            )
        }) {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxWidth()
        ) {

            InputTextField(
                label = "Enter the Address",
                text = address,
                color = greenAccent
            ) {
                address = it
            }

            Spacer(modifier = Modifier.height(10.dp))

            InputTextField(
                label = "Enter the Amount",
                text = amount,
                color = greenAccent
            ) {
                amount = it
            }

            Spacer(modifier = Modifier.height(10.dp))

            InputTextField(
                label = "Enter the Reason",
                text = reason,
                color = greenAccent
            ) {
                reason = it
            }

            Spacer(modifier = Modifier.height(20.dp))

            CustomElevatedButton(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp),
                buttonColor = green,
                text = "+ DEPOSIT",
                textColor = Color.White
            ) {
                
            }
        }
    }
}