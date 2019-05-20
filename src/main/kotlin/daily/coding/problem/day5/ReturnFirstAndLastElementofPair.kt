package daily.coding.problem.day5

class ReturnFirstAndLastElementofPair {
    fun cons(a: Int, b: Int): ((Int, Int) -> Int) -> Int {
        return { f: (a: Int, b: Int) -> Int -> f(a, b) }
    }
}


