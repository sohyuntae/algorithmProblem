class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        
        queries.forEach { (s, e, k) ->
            var temp = arr.filterIndexed { index, i ->
                index in s..e && i > k
            }.minOrNull()

            answer = if (temp == null) answer.plus(-1) else answer.plus(temp)
        }
        
        return answer
    }
}