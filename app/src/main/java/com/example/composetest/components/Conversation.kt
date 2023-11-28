package com.example.composetest.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composetest.data.SampleData
import com.example.composetest.domain.Message
import com.example.composetest.ui.theme.ComposeTestTheme


@Composable
fun Conversation(messages: List<Message>){
    LazyColumn {
        items(messages) { message ->
            MessageCard(message)
        }
    }
}

@Preview
@Composable
fun PreviewConversation() {
    ComposeTestTheme {
        Conversation(SampleData.conversationSample)
    }
}