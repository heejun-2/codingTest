package programmers;

import java.util.ArrayList;

public class Solution_163 {
	// 배열의 원소 삭제하기
	public int[] solution(int[] arr, int[] delete_list) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for(int j = 0; j < delete_list.length; j++) {
				if(arr[i] == delete_list[j]) {
					flag = false;
					break;
				}
			}
			
			if(flag) list.add(arr[i]);
		}
		
		
        int[] answer = list.stream()
        				.mapToInt(i -> i)
        				.toArray();
        
        return answer;
    }

}
