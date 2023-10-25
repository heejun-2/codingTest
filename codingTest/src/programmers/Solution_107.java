package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution_107 {
	// 튜플
	public int[] solution(String s) {
        s = s.substring(2, s.length()-2).replace("},{", "-");
        
        String[] arr = s.split("-");
        
        Arrays.sort(arr, (o1, o2) -> {
        	return o1.length() - o2.length();
        });
       
        ArrayList<Integer> list = new ArrayList<>();
        for(String ss : arr) {
        	String[] val = ss.split(",");
        	for(int i = 0; i < val.length; i++) {
        		int num = Integer.valueOf(val[i]);
        		
        		if(!list.contains(num)) {
        			list.add(num);
        		}
        	}
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }

}
