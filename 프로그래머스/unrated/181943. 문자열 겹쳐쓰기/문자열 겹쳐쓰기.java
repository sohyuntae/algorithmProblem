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
        
        // 추가
        // String before = my_string.substring(0, s);
        // String after = my_string.substring(s + overwrite_string.length());
        // return before + overwrite_string + after;
        
        return answer;
    }
}
