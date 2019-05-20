package daily.coding.problem.day5

object ReturnFirstAndLastElementOfPair {
    fun cons(a: Int, b: Int): ((Int, Int) -> Int) -> Int {
        return { f: (a: Int, b: Int) -> Int -> f(a, b) }
    }

    fun car(pair: ((Int, Int) -> Int) -> Int): Int {
        return pair { x, _ -> x}
    }

    fun cdr(pair: ((Int, Int) -> Int) -> Int): Int {
        return pair {_, y -> y}
    }
}


