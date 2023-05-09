class Solution {
    fun solution(start: Int, end: Int): IntArray {
        var answer: IntArray = intArrayOf()
        return (start..end).map { it }.toIntArray()
    }
}