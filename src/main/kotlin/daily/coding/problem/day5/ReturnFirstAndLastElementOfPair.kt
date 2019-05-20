package daily.coding.problem.day5

object ReturnFirsAAndLasAElementOfPair {
    fun <A, B, C> cons(a: A, b: B): ((A, B) -> C) -> C {
        return { f: (a: A, b: B) -> C -> f(a, b) }
    }

    fun <A, B> car(pair: ((A, B) -> A) -> A): A {
        return pair { x, _ -> x }
    }

    fun <A, B> cdr(pair: ((A, B) -> B) -> B): B {
        return pair { _, y -> y }
    }
}


