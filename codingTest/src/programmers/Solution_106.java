package programmers;

import java.util.LinkedList;

public class Solution_106 {
	// [1차] 캐시
	public int solution(int cacheSize, String[] cities) {
		if(cacheSize == 0) {
			return cities.length * 5;
		}
			
        int answer = 0;
        LinkedList<String> list = new LinkedList<>();
        
        for(String s : cities) {
        	String str = s.toLowerCase();
        	if(list.remove(str)) {
        		answer += 1;
        		list.add(str);
        	}
        	else {
        		answer += 5;
        		if(list.size() >= cacheSize) {
        			list.remove(0);
        		}
        		list.add(str);
        	}
        }
        
        return answer;
    }

}
