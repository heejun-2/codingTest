package programmers;

import java.util.ArrayList;

public class Solution_55 {
	// 같은 숫자는 싫어
	public int[] solution(int []arr) {
        
        ArrayList<Integer> a = new ArrayList<>();
        
        int num = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != num){
                a.add(arr[i]);
                num = arr[i];
            }
            
        }
        
        int[] answer = new int[a.size()];
        
        for(int i = 0; i < a.size(); i++){
            answer[i] = a.get(i);
        }

        return answer;
        
    }

}
