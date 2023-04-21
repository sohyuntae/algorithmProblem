class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        for (int x = 0; x < str1.length(); x++) {
            answer += str1.toCharArray()[x];
            answer += str2.toCharArray()[x];
        }
        
        return answer;
    }
}