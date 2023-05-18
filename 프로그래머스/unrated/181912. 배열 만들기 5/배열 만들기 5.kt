class Solution {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
        var answer: IntArray = intArrayOf()
        
        
        intStrs.forEach {
            var tempInt = it.substring(s, s+l)
            if (k < tempInt.toInt()) {
                answer = answer.plus(tempInt.toInt())
            }
        }
        
        return answer
    }
}