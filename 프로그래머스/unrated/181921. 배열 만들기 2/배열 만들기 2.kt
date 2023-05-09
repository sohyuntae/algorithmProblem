class Solution {
    fun solution(l: Int, r: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for (i in l..r) {
            if (i % 5 == 0) {
                var chars = i.toString()
                if (i == chars.filter { it == '0' || it == '5' }.toInt()) {
                    answer = answer.plus(i)
                }
            }
        }
        
        if (answer.size < 1) answer = answer.plus(-1)
        
        // 다른 개발자 내용
        // (l..r).filter { it.toString().all { ch -> ch == '0' || ch == '5' } }.takeIf(List<Int>::isNotEmpty) ?: listOf(-1)
        
        return answer
    }
}
