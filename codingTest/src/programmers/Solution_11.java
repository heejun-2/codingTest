package programmers;

public class Solution_11 {
	// 카드 뭉치
	public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        int firstIdx = 0;
        int secondIdx = 0;
        
        for(int i = 0; i < goal.length; i++){
            if(firstIdx < cards1.length && goal[i].equals(cards1[firstIdx])){
                firstIdx++;
                continue;
            }
            
            if(secondIdx < cards2.length && goal[i].equals(cards2[secondIdx])){
                secondIdx++;
                continue;
            }
            
            return "No";
        }
        
        return answer;
    }

}
