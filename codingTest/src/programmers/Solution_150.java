package programmers;

public class Solution_150 {
	// 인덱스 바꾸기
	public String solution(String my_string, int num1, int num2) {
		String[] arr = my_string.split("");
		
		String s = "";
		s = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = s;
		
        String answer = String.join("", arr);
        
        return answer;
    }

}
