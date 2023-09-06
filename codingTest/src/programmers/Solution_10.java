package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class Solution_10 {
	// 명예의 전당(1)
	public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < score.length; i++){
            list.add(score[i]);
            
            if(list.size() > k){
                list.remove(Collections.min(list));
            }
            
            answer[i] = Collections.min(list);
        }
        
        return answer;
    }

}
