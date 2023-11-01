package programmers;

import java.util.HashMap;
import java.util.Map;

public class Solution_119 {
	// 대충 만든 자판
	public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < keymap.length; i++) {
        	for(int j = 0; j < keymap[i].length(); j++) {
        		char c = keymap[i].charAt(j);
        		if(map.containsKey(c)) {
        			int idx = map.get(c);
        			map.put(c, Math.min(idx, j + 1));
        		}
        		else {
        			map.put(c, j + 1);
        		}
        	}
        }
        
        for(int i = 0; i < targets.length; i++) {
        	int cnt = 0;
        	boolean isPass = true;
        	String str = targets[i];
        	for(int j = 0; j < str.length(); j++) {
        		char c = str.charAt(j);
        		if(map.containsKey(c)) {
        			cnt += map.get(c);
        		}
        		else {
        			isPass = false;
        			break;
        		}
        	}
        	
        	answer[i] = isPass == false ? -1 : cnt;
        }
        return answer;
    }

}
