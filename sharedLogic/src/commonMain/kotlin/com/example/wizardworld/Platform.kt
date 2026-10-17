package com.example.wizardworld

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
