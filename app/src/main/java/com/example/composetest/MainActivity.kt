package com.example.composetest

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetest.components.Conversation
import com.example.composetest.components.MessageCard
import com.example.composetest.data.SampleData
import com.example.composetest.domain.Message
import com.example.composetest.ui.theme.ComposeTestTheme
import com.example.composetest.ui.theme.HSpace
import com.example.composetest.ui.theme.VSpace
import com.example.composetest.ui.theme.s40dp
import com.example.composetest.ui.theme.s4dp
import com.example.composetest.ui.theme.s8dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Conversation(messages = SampleData.conversationSample)
                }
            }
        }
    }
}


