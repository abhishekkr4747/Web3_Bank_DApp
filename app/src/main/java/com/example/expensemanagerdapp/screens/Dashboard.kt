package com.example.expensemanagerdapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.expensemanagerdapp.R
import com.example.expensemanagerdapp.navigation.AppScreens
import com.example.expensemanagerdapp.widgets.CustomElevatedButton
import com.example.expensemanagerdapp.widgets.TransactionColumnElement

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Dashboard(navController: NavController) {
    val green = Color(0xFF3fbf34)
    val accent = Color(0xFFD7D7FA)
    val greenAccent = Color(0xffddfad7)
    val  redAccent = Color(0xfffadbd7)

    Scaffold(containerColor = accent,
        topBar = {
            TopAppBar(
                title = {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "web3 Bank"
                            )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = accent)
            )
    }) {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Card(
                modifier = Modifier.padding(vertical = 10.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)

            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 14.dp, vertical = 4.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        imageVector = ImageVector.vectorResource(R.drawable.eth_logo),
                        contentDescription = "ETH-LOGO",
                        modifier = Modifier.size(50.dp)
                    )

                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "10 ETH",
                        fontSize = 50.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Row(
                modifier = Modifier
                    .padding(horizontal = 14.dp)
                    .fillMaxWidth()
            ) {
                CustomElevatedButton(
                    modifier = Modifier.weight(1f),
                    buttonColor = redAccent,
                    text = "- DEBIT",
                    textColor = Color.Red
                ) {
                    navController.navigate(AppScreens.Withdraw.name)
                }

                Spacer(modifier = Modifier.width(8.dp))

                CustomElevatedButton(
                    modifier = Modifier.weight(1f),
                    buttonColor = greenAccent,
                    text = "+ CREDIT",
                    textColor = green
                ) {
                    navController.navigate(AppScreens.Deposit.name)
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Transactions",
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(horizontal = 14.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(10.dp))

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(5) {
                    TransactionColumnElement()
                }
            }
        }
    }
}
