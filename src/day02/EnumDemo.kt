package day02

enum class Week{
    Monday, Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
}

fun main(args: Array<String>) {
    println(Week.Friday.ordinal)
}