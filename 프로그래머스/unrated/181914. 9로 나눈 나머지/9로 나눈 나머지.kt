class Solution {
    fun solution(number: String): Int {
        return number.map { it.digitToInt() }.sum() % 9
    }
}