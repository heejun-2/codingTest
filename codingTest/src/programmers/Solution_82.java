package programmers;

import java.util.Arrays;

public class Solution_82 {
	// 완주하지 못한 선수
	public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i = 0; i < completion.length; i++){
            if(participant[i].equals(completion[i])){
                continue;
            }
            else{
                return participant[i];
            }
        }
        return participant[participant.length-1];
    }

}
