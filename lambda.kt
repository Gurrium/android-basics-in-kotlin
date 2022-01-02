fun main() {
    // val triple: (Int) -> Int = { a: Int -> a * 3 }
    val triple: (Int) -> Int = {
        print(it)
        it * 3
    }
    println(triple(5))
    // println(hoge(5))
}

fun hoge(it: Int): Int {
    print(it)
    it * 3 // A 'return' expression required in a function with a block body ('{...}')
}
