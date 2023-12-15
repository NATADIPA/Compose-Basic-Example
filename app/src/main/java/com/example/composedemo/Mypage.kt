package com.example.composedemo
import Toggle
import android.annotation.SuppressLint
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

import androidx.compose.ui.unit.sp


val map = Mapping.map
val imageMap = Mapping.imageMap
@Preview
@Composable
fun MyPage() {
    Column {
        val scrollState = rememberScrollState()
        val changeState = rememberScrollState()
        Surface(color = Color(244,244,244,0xFF)) {
            Column(
                Modifier
                    .padding(horizontal = 20.dp)
                    .verticalScroll(scrollState)
            ) {
                Column {
                    Toggle()
                    Spacer(modifier = Modifier.height(345.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Mercedes-Benz",
                            style=typography.bodyLarge,
                            //fontSize = 30.sp,
                            lineHeight = 36.sp,
//                            fontWeight = FontWeight.W400
                        )
                        Surface(
                            modifier = Modifier
                                .clickable { }
                                .size(44.dp)
                                .border(
                                    width = 1.dp,
                                    SolidColor(Color(0, 136, 198, 0xFF)),
                                    shape = RoundedCornerShape(10.dp)
                                ),
                            shape = RoundedCornerShape(10.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.img_3),
                                contentDescription = "",
                                modifier = Modifier
                                    .padding(8.dp)
                                //.size(28.dp)
                            )
                        }
                    }
                    Text(
                        text = "Created by you",
                        modifier = Modifier.padding(bottom = 8.dp),
                        color = Color(0f, 0f, 0f, 0.60f),
                        style=typography.bodyLarge,
                        //fontSize = dpToSp(14.dp),
                        lineHeight = 18.sp,
                        //fontWeight = FontWeight.W600
                    )
                    Text(
                        text = "71563 Affalterbach, Germany",
                        Modifier.padding(bottom = 24.dp),
                        style=typography.bodyLarge,
                        //fontSize = 16.sp,
                        lineHeight = 20.sp,
                        //fontWeight = FontWeight.W400
                    )
                    Row(
                        Modifier
                            .horizontalScroll(changeState)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.img_10),
                            contentDescription = "",
                            //contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .shadow(6.dp, shape = RoundedCornerShape(6.dp))
                                .height(85.dp)
                                .width(128.dp)
                                .clip(shape = RoundedCornerShape(6.dp))
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Image(
                            painter = painterResource(R.drawable.img_2),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .shadow(6.dp, shape = RoundedCornerShape(6.dp))
                                .height(85.dp)
                                .width(128.dp)
                                .clip(shape = RoundedCornerShape(6.dp))
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Image(
                            painter = painterResource(R.drawable.img_11),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .height(85.dp)
                                .width(128.dp)
                                .clip(shape = RoundedCornerShape(6.dp))
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Image(
                            painter = painterResource(R.drawable.img_11),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .shadow(6.dp, shape = RoundedCornerShape(6.dp))
                                .height(85.dp)
                                .width(128.dp)
                                .clip(shape = RoundedCornerShape(6.dp))
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Image(
                            painter = painterResource(R.drawable.img_10),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .shadow(6.dp, shape = RoundedCornerShape(6.dp))
                                .height(85.dp)
                                .width(128.dp)
                                .clip(shape = RoundedCornerShape(6.dp))
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Image(
                            painter = painterResource(R.drawable.img_1),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .shadow(6.dp, shape = RoundedCornerShape(6.dp))
                                .height(85.dp)
                                .width(128.dp)
                                .clip(shape = RoundedCornerShape(6.dp))
                        )
                    }
                    Spacer(modifier = Modifier.height(33.dp))
//                    Column {
//                        GradientButton(
//                            text = "Upload to cloud",
//                            gradient = gradient,
//                            modifier=Modifier
//                                .fillMaxWidth()
//                                .padding(horizontal = 11.dp, vertical = 15.dp)
//                        )
//                    }
                    Button(onClick = { /*TODO*/ },
                        modifier = Modifier
                            .height(52.dp)
                            .fillMaxWidth(),
                        shape = RoundedCornerShape(9.dp),
                        colors = ButtonDefaults.buttonColors(
                            Color(0,136,198, 0xFF)
                        )) {
                        Text(
                            text = "Upload to cloud",
                            //fontSize= dpToSp(18.dp),
                            //fontWeight = FontWeight.W600,
                            letterSpacing = 0.2.sp,
                            lineHeight = 18.sp,
//                            modifier = Modifier
//                                .padding(
//                                    top = 11.dp,
//                                    bottom = 15.dp,
//                                ),
                            color = White
                        )
                    }
                    Spacer(modifier = Modifier.height(12.dp))
                    Button(onClick = { /*TODO*/ },
                        modifier = Modifier
                            .height(52.dp)
                            .fillMaxWidth()
                            .border(
                                width = 1.dp,
                                SolidColor(Color(0, 136, 198, 0xFF)),
                                shape = RoundedCornerShape(9.dp)
                            ),
                        shape = RoundedCornerShape(9.dp),
                        colors = ButtonDefaults.buttonColors(
                            White
                        )) {
                        Text(
                            text = "Send to vehicle ",
                            //fontSize= dpToSp(18.dp),
                            //fontWeight = FontWeight.W600,
                            letterSpacing = 0.2.sp,
                            lineHeight = 18.sp,
//                            modifier = Modifier
//                                .padding(
//                                    top = 12.dp,
//                                    bottom = 12.dp,
//                                ),
                            color = Color(0,136,198, 0xFF)
                        )
                    }
                    Text(text = "About this track",
                        modifier=Modifier.padding(top = 48.dp,bottom = 20.dp),
                        style=typography.bodyLarge,
                        //fontSize = dpToSp(25.dp),
                        lineHeight = 28.sp,
                        //fontWeight = FontWeight.W400
                    )
                    Surface(color = White,
                        modifier=Modifier,
                        shape = RoundedCornerShape(10.dp)) {
                        Column(modifier = Modifier.padding(top = 4.dp)) {
                            for (key in map.keys) {
                                if(map[key] != null && map[key] != "0") {
                                    Row(
                                        modifier = Modifier
                                            .padding(start = 16.dp)
                                            .fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Column {
                                            Image(
                                                painter = painterResource(id = imageMap.getValue(key)),
                                                contentDescription = "Total distance",
                                                modifier = Modifier
                                                    .padding(top = 8.dp)
                                                    .size(32.dp),
                                            )
                                            Text(
                                                text = "$key",

                                                //fontSize = dpToSp(14.dp),
                                                lineHeight = 18.sp,
                                                style= typography.bodyMedium,
                                                //fontWeight = FontWeight.W600,
                                                color = Color(0, 0, 0, 0x99),
                                                modifier = Modifier
                                                    .padding(start = 4.dp, bottom = 12.dp)
                                            )
                                        }
                                        Text(
                                            text = map[key]!!,
                                            style= typography.bodyMedium,
                                            modifier = Modifier
                                                .align(Alignment.CenterVertically)
                                                .padding(end = 20.dp),
                                            //fontSize = dpToSp(26.dp),
                                            lineHeight = 28.sp,
                                            //fontWeight = FontWeight.W400
                                        )
                                    }
                                    Divider(modifier = Modifier
                                        .padding(start = 20.dp, end = 20.dp)
                                        .height(1.dp),
                                        color = Color(221,221,221, 0xFF),
                                    )
                                }
                            }
                        }
                    }
                    Text(text = "Your Northern Straight Stories",
                        modifier=Modifier.padding(top = 48.dp,bottom = 20.dp),
                        //fontSize = 25.sp,
                        lineHeight = 28.sp,
                        //fontWeight = FontWeight.W400,
                        style=typography.bodyLarge,
                    )
                    Adventure()
                }
            }
        }
    }
}
@SuppressLint("SuspiciousIndentation")
@Composable
fun Adventure() {
    Row(
    ) {
        Box (modifier = Modifier.clickable {  }){
            Image(
                painter = painterResource(R.drawable.img_10),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(211.dp)
                    .width(264.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
            )
            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
            ) {
                Text(
                    text = "My Hockenheim Adventure",
                    Modifier.padding(start = 20.dp),
                    fontSize = 18.sp,
                    letterSpacing = 0.2.sp,
                    lineHeight = 22.sp,
                    fontWeight = FontWeight.W400,
                    color = White
                )
                Row() {
                    Column(
                        modifier = Modifier
                            .padding(start = 20.dp, top = 12.dp, bottom = 20.dp)
                            .alpha(0.6F)
                            .border(
                                width = 0.6.dp,
                                SolidColor(White), shape = RoundedCornerShape(6.dp)
                            )
                    ) {
                        Text(
                            text = "3:44:76 min",
                            Modifier
                                .alpha(0.6F)
                                .padding(4.dp, 1.dp),
                            lineHeight = 16.sp,
                            style = typography.bodyMedium,
                            //fontWeight = FontWeight.W400,
                            color = White
                        )
                    }
                    Text(
                        text = "18.05.2021",
                        Modifier
                            .padding(start = 8.dp, top = 12.dp, bottom = 20.dp)
                            .alpha(0.6F),
                        //fontSize = 13.sp,
                        lineHeight = 16.sp,
                        style = typography.bodySmall,
                        //fontWeight = FontWeight.W600,
                        color = White
                    )
                    Image(
                        painter = painterResource(R.drawable.ic__lock_closed),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(start = 8.dp, top = 12.dp, bottom = 20.dp)
                            .alpha(0.6F)
                    )
                }
            }
        }
        Spacer(modifier = Modifier.width(10.dp))
        Box(modifier = Modifier.clickable {  }) {
            Image(
                painter = painterResource(R.drawable.img_12),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(211.dp)
                    .width(264.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
            )
            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
            ) {
                Text(
                    text = "Sommer in Hockenheim ",
                    Modifier.padding(start = 20.dp),
                    //style = typography.body2,
                    fontSize = dpToSp(18.dp),
                    letterSpacing = 0.2.sp,
                    lineHeight = 22.sp,
                    fontWeight = FontWeight.W400,
                    color = White
                )
                //Spacer(modifier = Modifier.height(10.dp))
                Row() {
                    Column(
                        modifier = Modifier
                            .padding(start = 20.dp, top = 12.dp, bottom = 20.dp)
                            .alpha(0.6F)
                            .border(
                                width = 0.6.dp,
                                SolidColor(White), shape = RoundedCornerShape(6.dp)
                            )
                    ) {
                        Text(
                            text = "1:52:89 min",
                            Modifier
                                .padding(4.dp, 2.dp)
                                .alpha(0.6F),
                            //fontSize = dpToSp(12.dp),
                            style = typography.bodyMedium,
                            lineHeight = 16.sp,
                            //fontWeight = FontWeight.W400,
                            color = White
                        )
                    }
                    Text(
                        text = "18.05.2021",
                        Modifier
                            .padding(start = 8.dp, top = 12.dp, bottom = 20.dp)
                            .alpha(0.6F),
                        //fontSize = dpToSp(13.dp),
                        style = typography.bodyMedium,
                        lineHeight = 16.sp,
                        //fontWeight = FontWeight.W600,
                        color = White
                    )
                    Image(
                        painter = painterResource(R.drawable.ic__lock_closed),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(start = 8.dp, top = 12.dp, bottom = 20.dp)
                            .alpha(0.6F)
                    )
                }
            }
        }
        Spacer(modifier = Modifier.width(10.dp))
        Box (modifier = Modifier.clickable {  }){
            Image(
                painter = painterResource(R.drawable.img_13),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(211.dp)
                    .width(264.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
            )
            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
            ) {
                Text(
                    text = "My Hockenheim Adventure",
                    Modifier.padding(start = 20.dp),
                    //style = typography.body2,
                    fontSize = dpToSp(18.dp),
                    letterSpacing = 0.2.sp,
                    lineHeight = 22.sp,
                    fontWeight = FontWeight.W400,
                    color = White
                )
                Row() {
                    Column(
                        modifier = Modifier
                            .padding(start = 20.dp, top = 12.dp, bottom = 20.dp)
                            .alpha(0.6F)
                            .border(
                                width = 0.6.dp,
                                SolidColor(White),
                                shape = RoundedCornerShape(6.dp)
                            )
                    ) {

                        Text(
                            text = "3:44:76 min",
                            Modifier
                                .padding(4.dp, 1.dp)
                                .alpha(0.6F),
                            //fontSize = 12.sp,
                            style = typography.bodyMedium,
                            lineHeight = 16.sp,
                            //fontWeight = FontWeight.W400,
                            color = White
                        )
                    }
                    Text(
                        text = "18.05.2021",
                        Modifier
                            .padding(start = 8.dp, top = 12.dp, bottom = 20.dp)
                            .alpha(0.6F),
                        //fontSize = dpToSp(13.dp),
                        style = typography.bodyMedium,
                        lineHeight = 16.sp,
                        //fontWeight = FontWeight.W600,
                        color = White
                    )
                    Image(
                        painter = painterResource(R.drawable.ic__lock_closed),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(start = 8.dp, top = 12.dp, bottom = 20.dp)
                            .alpha(0.6F)
                    )
                }
            }
        }
    }
    Spacer(modifier = Modifier.height(34.dp))
}
@Composable
fun dpToSp(dp: Dp) = with(LocalDensity.current) {dp.toSp()}


@Composable
@Preview
fun previewww(){
    MyPage()
}



