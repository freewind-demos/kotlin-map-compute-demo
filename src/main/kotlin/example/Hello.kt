package example

fun main(args: Array<String>) {
    val map = mutableMapOf<String, Int>()

    println("1:$map")

    map.computeIfPresent("aaa") { _, value -> value + 1 }

    println("2:$map")

    map.computeIfAbsent("aaa") { 1 }

    println("3:$map")

    map.computeIfPresent("aaa") { _, value -> value + 2 }

    println("4:$map")

    map.compute("aaa") { _, value -> (value ?: 0) + 3 }

    println("5:$map")
}
