package programmers;

public class Solution_09 {
	// 크기가 작은 부분 문자열
	public int solution(String t, String p) {
        int answer = 0;
        long pp = Long.parseLong(p);
        
        for(int i = 0; i < t.length() - p.length() + 1; i++){
            String s = t.substring(i, i + p.length());
            long tt = Long.parseLong(s);
            
            if(pp >= tt) answer++;
        }
        
        return answer;
    }

}
