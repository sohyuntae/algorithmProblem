class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        
        queries.forEach { (s, e, k) ->
            var temp = arr.filterIndexed { index, i ->
                index in s..e && i > k
            }.minOrNull()

            answer = if (temp == null) answer.plus(-1) else answer.plus(temp)
        }
        
        
        // 다른분들이 푼것 내용 체크
        queries.map { q ->
            val min = arr.sliceArray(q[0]..q[1]).filter { it > q[2] }.minOrNull() ?: -1
            return@map if (min == Int.MAX_VALUE) -1 else min
        }
        
        return answer
    }
}
