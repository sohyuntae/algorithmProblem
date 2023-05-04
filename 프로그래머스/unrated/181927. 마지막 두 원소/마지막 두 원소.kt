class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        if (num_list[num_list.size - 1] > num_list[num_list.size - 2]) {
            answer = num_list.plus(num_list[num_list.size - 1] - num_list[num_list.size - 2])
        } else {
            answer = num_list.plus(num_list[num_list.size - 1] * 2)
        }
        return answer
    }
}