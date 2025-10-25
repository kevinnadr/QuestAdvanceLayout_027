package com.example.questadvancelayout_027

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



val DarkBackground = Color(color = 0xFF1C1C1E)
val CardBackground = Color(color = 0xFF2C2C2E)
val TextGray = Color(color = 0xFF8E8E93)


@Composable
fun ProfileScreen(modifier: Modifier) {
    Surface(
        color = DarkBackground,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(height = 30.dp))

            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = "Foto Profil",
                alignment = BiasAlignment(horizontalBias = 0f, verticalBias = 0.2f),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(size = 120.dp)
                    .clip(CircleShape)
                    .border(width = 2.dp, Color.Gray, CircleShape)
            )

            Spacer(modifier = Modifier.height(height = 16.dp))


            Row(
                horizontalArrangement = Arrangement.spacedBy(space = 16.dp)
            ) {

                SocialIcon(id = R.drawable.facebook)
                SocialIcon(id = R.drawable.instagram)
                SocialIcon(id = R.drawable.twitter)
                SocialIcon(id = R.drawable.linkedin)
            }
}