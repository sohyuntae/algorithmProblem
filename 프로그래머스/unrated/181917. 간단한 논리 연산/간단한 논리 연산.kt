class Solution {
    fun solution(x1: Boolean, x2: Boolean, x3: Boolean, x4: Boolean): Boolean {
        var answer: Boolean = true
        
        var temp1: Boolean
        var temp2: Boolean

        if (x1 == x2) {
            temp1 = x1
        } else {
            temp1 = true
        }

        if (x3 == x4) {
            temp2 = x3
        } else {
            temp2 = true
        }
        
        if (temp1 == temp2) {
            answer = temp1
        } else {
            answer = false
        }
        
        return answer
    }
}