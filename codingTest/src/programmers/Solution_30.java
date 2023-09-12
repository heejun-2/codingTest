package programmers;

public class Solution_30 {
	// 자연수 뒤집어 배열로 만들기
	public int[] solution(long n) {
        
        String s = String.valueOf(n); 
        
        int[] answer = new int[s.length()];
        
        for(int i = s.length()-1; i >= 0; i--){
            answer[s.length()-1-i] = s.charAt(i) - '0';
        }
           
        
        return answer;
    }

}
