package programmers;

import java.util.HashMap;
import java.util.Map;

public class Solution_105 {
	// 의상
	public int solution(String[][] clothes) {
        int answer = 1;
         
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < clothes.length; i++) {
        	String type = clothes[i][1];
        	map.put(type, map.getOrDefault(type, 0) + 1);
        }
        
        for(String key : map.keySet()) {
        	answer *= map.get(key) + 1;
        }
        
        return answer - 1;
    }

}
