class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var answer: String = my_string
        
        queries.forEach { x ->
            var temString = answer.slice(x[0]..x[1])
            answer = answer.slice(0 until x[0]) + temString.reversed() + answer.slice(x[1] + 1 until answer.length)
        }
        
        return answer
    }
}