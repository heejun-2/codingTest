package programmers;

import java.util.ArrayList;

public class Solution_155 {
	// 5명씩
	public String[] solution(String[] names) {
		ArrayList<String> list = new ArrayList<>();
		
		for(int i = 0; i < names.length; i++) {
			if(i % 5 == 0) list.add(names[i]);
		}
		
        return list.toArray(new String[list.size()]);
    }

}
