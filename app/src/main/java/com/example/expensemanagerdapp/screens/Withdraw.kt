package com.example.expensemanagerdapp.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.expensemanagerdapp.widgets.CustomElevatedButton
import com.example.expensemanagerdapp.widgets.InputTextField

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Withdraw() {
    val  redAccent = Color(0xfffadbd7)

    var address by remember {
        mutableStateOf("")
    }
    var amount by remember {
        mutableStateOf("")
    }
    var reason by remember {
        mutableStateOf("")
    }

    Scaffold(containerColor = redAccent,
        topBar = {
            TopAppBar(
                title = {
                    Box(
                        contentAlignment = Alignment.CenterStart
                    ) {
                        Text(
                            text = "Withdraw Details",
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = redAccent)
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
                color = redAccent
            ) {
                address = it
            }

            Spacer(modifier = Modifier.height(10.dp))

            InputTextField(
                label = "Enter the Amount",
                text = amount,
                color = redAccent
            ) {
                amount = it
            }

            Spacer(modifier = Modifier.height(10.dp))

            InputTextField(
                label = "Enter the Reason",
                text = reason,
                color = redAccent
            ) {
                reason = it
            }

            Spacer(modifier = Modifier.height(20.dp))

            CustomElevatedButton(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp),
                buttonColor = Color.Red,
                text = "- WITHDRAW",
                textColor = Color.White
            ) {

            }
        }
    }
}