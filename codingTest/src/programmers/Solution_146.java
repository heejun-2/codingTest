package programmers;

public class Solution_146 {
    // 특정한 문자를 대문자로 바꾸기
    public String solution(String my_string, String alp) {
        String answer = my_string.replace(alp, alp.toUpperCase());

        return answer;
    }
}
