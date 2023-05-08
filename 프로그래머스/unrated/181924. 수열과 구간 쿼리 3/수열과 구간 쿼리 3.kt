class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = arr
        
        queries.forEach { (x, y) ->
            var tempInt = answer[x]
            answer[x] = answer[y]
            answer[y] = tempInt
        }
        
        return answer
    }
}