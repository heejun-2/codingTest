package programmers;

public class Solution_58 {
	// 이상한 문자 만들기
	public String solution(String s) {
        String answer = "";
        
        String[] s1 = s.split("");
        int count = 0;
        
        for(String s2 : s1){
            if(s2.contains(" ")){
                count = 0;
            }
            else{
                count++;
            }
            
            if(count % 2 == 0){
                answer += s2.toLowerCase();
            }
            else{
                answer += s2.toUpperCase();
            }
        }
        
        
        return answer;
    }

}
