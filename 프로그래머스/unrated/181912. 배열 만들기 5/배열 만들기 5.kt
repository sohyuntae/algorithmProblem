class Solution {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
        var answer: IntArray = intArrayOf()
        
        
        intStrs.forEach {
            var tempInt = it.substring(s, s+l)
            if (k < tempInt.toInt()) {
                answer = answer.plus(tempInt.toInt())
            }
        }
        
        // 다른 사람 풀이 (map 사용)
        // return intStrs.map { it.substring(s, s + l).toInt() }.filter { it > k }
        
        return answer
    }
}
