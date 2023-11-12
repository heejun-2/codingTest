package programmers;

public class Solution_171 {
    // 가위 바위 보
    public String solution(String rsp) {
        String answer = "";

        for(char c : rsp.toCharArray()){
            if(c == '2'){
                answer += '0';
            }
            else if(c == '0'){
                answer += '5';
            }
            else{
                answer += '2';
            }
        }

        return answer;
    }
}
