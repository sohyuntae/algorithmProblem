class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String str1 = a + String.valueOf(b);
        
        return Math.max(Integer.parseInt(str1), (2 * a * b));
    }
}