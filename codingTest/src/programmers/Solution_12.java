package programmers;

import java.util.HashSet;

public class Solution_12 {
	// 폰켓몬
	public int solution(int[] nums) {
        int answer = 0;
        int maxPick = nums.length / 2;
        
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i : nums){
            hs.add(i);
        }
        
        if(maxPick > hs.size()){
            answer = hs.size();
        }else{
            answer = maxPick;
        }
        
        return answer;
    }

}
