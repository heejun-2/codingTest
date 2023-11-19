package programmers;

public class Solution_174 {
	// 숨어있는 숫자의 덧셈(1)
	public int solution(String my_string) {
        int answer = 0;
        for(int i = 0; i < my_string.length(); i++) {
        	int num = my_string.charAt(i) - '0';
        	if(num >= 0 && num <= 9) answer += num; 
        }
        return answer;
    }

}
