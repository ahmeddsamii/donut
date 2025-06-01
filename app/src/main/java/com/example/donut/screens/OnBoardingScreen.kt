package com.example.donut.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donut.R
import com.example.donut.composable.CustomButton

@Composable
fun OnBoardingScreen() {
    Box(modifier = Modifier)
    {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xffFED8DF))
                .verticalScroll(rememberScrollState())
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(R.drawable.donut1),
                    contentDescription = "donut",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth(0.4f)
                        .height(
                            LocalConfiguration.current.screenWidthDp.dp * 0.4f
                        )
                )

                Image(
                    painter = painterResource(R.drawable.donut_with_pink_icing),
                    contentDescription = "donut",
                    modifier = Modifier
                        .width(LocalConfiguration.current.screenWidthDp.dp * 0.6f)
                        .align(Alignment.Bottom)
                        .height(
                            LocalConfiguration.current.screenWidthDp.dp * 0.4f
                        )
                        .padding(top = 35.dp, end = 35.dp)
                        .offset(y = LocalConfiguration.current.screenHeightDp.times(0.05).dp)
                )
            }

            Image(
                painter = painterResource(R.drawable.donuts),
                contentDescription = "donuts",
                modifier = Modifier
                    .requiredWidth(LocalConfiguration.current.screenWidthDp.dp + 272.dp)
                    .rotate(
                        16.18f
                    )
                    .padding(start = 35.dp)
            )

            Image(
                painter = painterResource(R.drawable.donut_with_pink_icing_2),
                contentDescription = "donut",
                modifier = Modifier
                    .fillMaxWidth(0.4f)
                    .align(Alignment.Start)
                    .height(
                        LocalConfiguration.current.screenWidthDp.dp * 0.15f
                    )
                    .offset(y = LocalConfiguration.current.screenHeightDp.dp * -0.1f)
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Gonuts\nwith\nDonuts",
                    style = TextStyle(
                        fontSize = 54.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFFFF7074),
                    ),
                    modifier = Modifier.padding(start = 40.dp, top = 32.dp)
                )

                Image(
                    painter = painterResource(R.drawable.dount_4),
                    contentDescription = "donut",
                    modifier = Modifier
                        .height(
                            LocalConfiguration.current.screenWidthDp.dp * 0.3f
                        )
                        .offset(x = LocalConfiguration.current.screenHeightDp.dp * 0.09f)
                        .rotate(8.61f),
                    contentScale = ContentScale.Fit
                )
            }

            Text(
                text = "Gonuts with Donuts is a Sri Lanka dedicated food outlets for specialize manufacturing of Donuts in Colombo, Sri Lanka.",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFFFF9494),
                ),
                modifier = Modifier.padding(start = 40.dp, top = 19.dp, end = 40.dp)
            )

            Spacer(Modifier.weight(1f))

            CustomButton(
                onClick = {},
                backgroundColor = Color.White,
                contentColor = Color.Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 46.dp, start = 40.dp, end = 40.dp, top = 12.dp)
                    .align(Alignment.End)
            ){
                Text(
                    text = "Get Started",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight(600),
                    )
                )
            }
        }
    }
}



@Preview(name = "Phone - Medium", widthDp = 360)
@Composable
fun MyScreenPreview() {
    OnBoardingScreen()
}