package programmers;

public class Solution_164 {
	// x 사이의 개수
	public int[] solution(String myString) {
		String[] arr = myString.split("x", -1);
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
        	answer[i] = arr[i].length();
        }
        
        return answer;
    }

}
