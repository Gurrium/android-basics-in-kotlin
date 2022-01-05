fun main() {
    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
    val filteredWordsStartWithB = words.filter { it.startsWith("b", ignoreCase = true) }
    .shuffled()
    .take(2)
    .sorted()
	println(filteredWordsStartWithB)
    val filteredWordsStartWithC = words.filter { it.startsWith("c", ignoreCase = true) }
    .shuffled()
    .take(1)
	println(filteredWordsStartWithC)
}
