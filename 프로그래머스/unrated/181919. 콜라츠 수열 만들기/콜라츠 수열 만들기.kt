class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var t = n
        answer = answer.plus(t)
        while (true) {
            if (t == 1) {
                break
            }
            if (t % 2 == 0) {
                t /= 2
            } else {
                t = t * 3 + 1
                
            }
            answer = answer.plus(t)
        }
        return answer
    }
}