package programmers;

public class Solution_131 {
	// 문자열의 뒤의 n글자
	public String solution(String my_string, int n) {
        String answer = my_string.substring(my_string.length() - n);
     
        return answer;
    }

}
