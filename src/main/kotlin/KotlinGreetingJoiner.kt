package main.kotlin

import java.util.*

class KotlinGreetingJoiner(private val greeter: Greeter) {

    private val names = ArrayList<String?>()

    fun addName(name: String?) {
        names.add(name)
    }

    fun getJoinedGreeting(): String {
        return "${greeter.gretting} ${names.filterNotNull().joinToString(separator = " and ")}"
    }
}

