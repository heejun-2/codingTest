package programmers;

public class Solution_176 {
	// 부분 문자열인지 확인하기
	public int solution(String my_string, String target) {
        int answer = 0;
        if(my_string.contains(target)) {
        	answer = 1;
        }
        return answer;
    }

}
