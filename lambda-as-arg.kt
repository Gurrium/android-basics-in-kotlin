fun main() {
    executeFuncWithOneParameter { println("one") } // one
    executeFuncWithOneParameter { _ -> println("another") } // another
    // executeFuncWithTwoParameters { print("two") } // Type mismatch: inferred type is () -> Unit but (Int, Int) -> Unit was expected
    // executeFuncWithTwoParameters { _ -> print("two") } // Type mismatch: inferred type is (Int) -> Unit but (Int, Int) -> Unit was expected
    executeFuncWithTwoParameters { _, _ -> println("two") } // two
}

fun executeFuncWithOneParameter(f: (Int) -> Unit) {
    f(1)
}

fun executeFuncWithTwoParameters(f: (Int, Int) -> Unit) {
    f(1, 2)
}
