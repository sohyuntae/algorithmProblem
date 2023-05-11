class Solution {
    fun solution(my_string: String, index_list: IntArray): String {
        var answer: String = ""
        index_list.forEach { x ->
            answer = answer.plus(my_string.filterIndexed { index, c -> index == x })
        }
        return answer
    }
}