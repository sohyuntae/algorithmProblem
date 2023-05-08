class Solution {
    fun solution(numLog: IntArray): String {
        var answer: String = ""
        
        var cnt = 0

        while (cnt < numLog.size -1) {
            var num_1 = numLog[cnt]
            var num_2 = numLog[cnt+1]

            when(num_2 - num_1) {
                1 -> answer += "w"
                -1 -> answer += "s"
                10 -> answer += "d"
                -10 -> answer += "a"
            }
            cnt++
        }
        
        return answer
    }
}