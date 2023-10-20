package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Solution_98 {
	// 귤 고르기
	Map<Integer, Integer> map = new HashMap<>();
	public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        for(int i : tangerine) {
        	map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, new customComparartor());
        
        for(int i : list) {
        	if(k <= 0) break;
        	answer++;
        	k -= map.get(i);
        }
        
        return answer;
    }
	
	public class customComparartor implements Comparator<Integer>{
		
		@Override
		public int compare(Integer o1, Integer o2) {
			return map.get(o2) - map.get(o1);
		}
	}

}
