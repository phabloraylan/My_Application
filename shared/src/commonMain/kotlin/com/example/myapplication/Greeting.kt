package com.example.myapplication

import kotlin.random.Random

class Greeting {
    private val platform: Platform = getPlatform()

    private val daysPhrase = "There are only ${daysUntilNewYear()} days left until New Year! 🎆"

    fun greet(): List<String> = buildList {
        add(if (Random.nextBoolean()) "Hi!" else "Hello!")
        add("Guess what it is! > ${platform.name.reversed()}!")
        add(daysPhrase)
    }
}