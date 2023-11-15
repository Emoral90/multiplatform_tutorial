package com.example.multiplatform_tutorial

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform