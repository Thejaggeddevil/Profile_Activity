package com.mansi.profileactivity.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.mansi.profileactivity.R
import com.mansi.profileactivity.ui.theme.ProfileActivityTheme

@Composable
fun ProfileScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF181818)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .background(Color(0xFF181818))
        ) {
            // Top Bar
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, start = 16.dp, end = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.back),
                    contentDescription = "Back",
                    tint = Color.Unspecified,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Text(
                    text = "Profile",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(modifier = Modifier.weight(1f))
                OutlinedIconButton(
                    iconRes = R.drawable.chat,
                    
                    contentDescription = "Support"
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Profile Info
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape)
                        .background(Color(0xFF232323))
                ) {
                    Image(
                        painter = rememberAsyncImagePainter("https://randomuser.me/api/portraits/men/1.jpg"),
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text(
                        text = "andaz Kumar",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Text(
                        text = "member since Dec, 2020",
                        color = Color(0xFF8E8E93),
                        fontSize = 13.sp
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                OutlinedIconButton(
                    iconRes = R.drawable.edit,
                    contentDescription = "Edit"
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            // CRED Garage Card
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .border(1.dp, Color(0xFF232323), RoundedCornerShape(8.dp))
                    .background(Color(0xFF181818), RoundedCornerShape(8.dp))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(18.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    OutlinedIconCircle(
                        iconRes = R.drawable.car,
                        contentDescription = "Garage"
                    )
                    Spacer(modifier = Modifier.width(14.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "get to know your vehicles, inside out",
                            color = Color(0xFF8E8E93),
                            fontSize = 13.sp
                        )
                        Text(
                            text = "CRED garage",
                            color = Color.White,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                    Icon(
                        painter = painterResource(id = R.drawable.right_arrow),
                        contentDescription = null,
                        tint = Color.Unspecified,
                        modifier = Modifier.size(18.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Credit Score, Cashback, Bank
            ProfileListItem(
                iconRes = R.drawable.rupee,
                title = "credit score",
                subtitle = "REFRESH AVAILABLE",
                value = "767",
                valueColor = Color(0xFF3DDC84)
            )
            ProfileListItem(
                iconRes = R.drawable.rupee,
                title = "lifetime cashback",
                value = "₹3"
            )
            ProfileListItem(
                iconRes = R.drawable.cashback,
                title = "bank balance",
                value = "check"
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Rewards Section
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF202020))
                    .padding(vertical = 18.dp, horizontal = 16.dp)
            ) {
                Column {
                    Text(
                        text = "YOUR REWARDS & BENEFITS",
                        color = Color(0xFF8E8E93),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium
                    )
                    Spacer(modifier = Modifier.height(18.dp))
                    ProfileListItem(
                        iconRes = R.drawable.cashback,
                        title = "cashback balance",
                        value = "₹0",
                        isBold = true,
                        subtitle = ""
                    )
                    ProfileListItem(
                        iconRes = R.drawable.cashback,
                        title = "coins",
                        value = "26,46,583",
                        isBold = true,
                        subtitle = ""
                    )
                    ProfileListItem(
                        iconRes = R.drawable.cashback,
                        title = "win upto Rs 1000",
                        value = "",
                        subtitle = "refer and earn"
                    )
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Transactions Section
            Text(
                text = "TRANSACTIONS & SUPPORT",
                color = Color(0xFF8E8E93),
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(start = 16.dp, bottom = 8.dp)
            )
            ProfileListItem(
                iconRes = R.drawable.cashback,
                title = "all transactions",
                value = ""
            )
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

@Composable
fun OutlinedIconButton(iconRes: Int, contentDescription: String?) {
    Box(
        modifier = Modifier
            .size(36.dp)
            .clip(CircleShape)
            .background(Color(0xFF232323))
            .clickable { },
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = painterResource(id = iconRes),
            contentDescription = contentDescription,
            tint = Color.Unspecified,
            modifier = Modifier.size(20.dp)
        )
    }
}

@Composable
fun OutlinedIconCircle(iconRes: Int, contentDescription: String?) {
    Box(
        modifier = Modifier
            .size(36.dp)
            .clip(CircleShape)
            .background(Color.Transparent)
            .border(1.dp, Color(0xFF232323), CircleShape),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = painterResource(id = iconRes),
            contentDescription = contentDescription,
            tint = Color.Unspecified,
            modifier = Modifier.size(20.dp)
        )
    }
}

@Composable
fun ProfileListItem(
    iconRes: Int,
    title: String,
    value: String = "",
    subtitle: String = "",
    valueColor: Color = Color.White,
    isBold: Boolean = false
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .border(0.5.dp, Color(0xFF232323), RectangleShape),
        verticalAlignment = Alignment.CenterVertically
    ) {
        OutlinedIconCircle(
            iconRes = iconRes,
            contentDescription = null
        )
        Spacer(modifier = Modifier.width(14.dp))
        Column(modifier = Modifier.weight(1f)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = title,
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = if (isBold) FontWeight.Bold else FontWeight.Normal
                )
                if (subtitle.isNotEmpty()) {
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "• $subtitle",
                        color = Color(0xFF3DDC84),
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
            }
            if (value.isNotEmpty() && subtitle.isEmpty()) {
                Text(
                    text = value,
                    color = valueColor,
                    fontSize = 15.sp,
                    fontWeight = if (isBold) FontWeight.Bold else FontWeight.Normal
                )
            }
            if (subtitle.isNotEmpty() && value.isNotEmpty()) {
                Text(
                    text = value,
                    color = valueColor,
                    fontSize = 15.sp
                )
            }
            if (subtitle.isNotEmpty() && value.isEmpty()) {
                Text(
                    text = subtitle,
                    color = Color(0xFF8E8E93),
                    fontSize = 13.sp
                )
            }
        }
        Icon(
            painter = painterResource(id = R.drawable.right_arrow),
            contentDescription = null,
            tint = Color.Unspecified,
            modifier = Modifier.size(18.dp)
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF181818)
@Composable
fun ProfileScreenPreview() {
    ProfileActivityTheme {
        ProfileScreen()
    }
} 