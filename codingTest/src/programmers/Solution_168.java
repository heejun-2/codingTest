package programmers;

public class Solution_168 {
	// 한 번만 등장한 문자
	public String solution(String s) {
        String answer = "";
        int[] arr = new int[26];
        for(int i = 0; i < s.length(); i++) {
        	arr[s.charAt(i) - 97]++;
        }
        
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] == 1) {
        		char c = (char) (i + 97);
        		answer += c;
        	}
        }
        return answer;
    }

}
