package net.bradball.teetimes

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform