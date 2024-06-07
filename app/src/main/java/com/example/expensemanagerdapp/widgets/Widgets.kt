package com.example.expensemanagerdapp.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.expensemanagerdapp.R
import com.example.expensemanagerdapp.navigation.AppScreens

@Composable
fun TransactionColumnElement(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .padding(horizontal = 14.dp)
            .background(color = Color.White, shape = RoundedCornerShape(12.dp))
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 12.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    imageVector = ImageVector.vectorResource(R.drawable.eth_logo),
                    contentDescription = "ETH-LOGO",
                    modifier = Modifier.size(24.dp)
                )
                
                Spacer(modifier = Modifier.width(6.dp))

                Text(
                    text = "1 ETH",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold)
            }

            Text(
                text = "0xfFe588fa11019dd73C664A34f80CEad309468bcF",
                fontSize = 12.sp
            )

            Text(
                text = "NFT Purchase",
                fontSize = 16.sp
            )
        }
    }
}


@Composable
fun InputTextField(
    label: String,
    text: String,
    color: Color,
    onTextChanged: (String) -> Unit
) {
    TextField(value = text,
        onValueChange = { onTextChanged(it) },
        modifier = Modifier
            .padding(horizontal = 10.dp)
            .fillMaxWidth(),
        label = {
            Text(text = label)
        },
        colors = TextFieldDefaults.colors(
            unfocusedContainerColor = color,
            focusedContainerColor = Color.White,
            focusedIndicatorColor = Color.Transparent
        )
    )
}

@Composable
fun CustomElevatedButton(
    modifier: Modifier = Modifier,
    buttonColor: Color,
    text: String,
    textColor: Color,
    onButtonClicked: () -> Unit
) {
    ElevatedButton(
        onClick = { onButtonClicked() },
        modifier = modifier
            .height(50.dp),
        colors = ButtonDefaults.buttonColors(containerColor = buttonColor),
        shape = RoundedCornerShape(12.dp)
    ) {
        Text(
                text = text,
            color = textColor,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
    }
}
