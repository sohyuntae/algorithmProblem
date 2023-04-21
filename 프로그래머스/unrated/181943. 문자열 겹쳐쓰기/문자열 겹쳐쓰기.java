class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        
        for(char c: my_string.toCharArray()) {
            if (answer.length() >= s) {
                answer += overwrite_string;
                answer += my_string.substring(answer.length());
                break;
            } else {
                answer += c;
            }
        }
        
        return answer;
    }
}