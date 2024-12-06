package com.example.whatapp.data

data class TabData(
    val title: String,
    val unreadCount: Int?
)

val tabs = listOf(
    TabData(title = Tabs.CHATS.value, unreadCount = null),
    TabData(title = Tabs.STATUS.value, unreadCount = null),
    TabData(title = Tabs.CALLS.value, unreadCount = 4),
)

enum class Tabs(val value: String) {
    CHATS("Chats"),
    STATUS("status"),
    CALLS("calls")
}
