class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        
        int check = 0;
        while (check < k) {
            answer += my_string;
            check++;
        }
        
        return answer;
    }
}