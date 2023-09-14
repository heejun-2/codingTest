package programmers;

import java.util.Arrays;
import java.util.Collections;

public class Solution_35 {
	// 정수 내림차순으로 배치하기
	public long solution(long n) {
        
        String[] arr = Long.toString(n).split("");
       
        //내림차순 정렬
        Arrays.sort(arr, Collections.reverseOrder());
            
        String result = "";
        for(String i : arr){
            result += i;
        }
        
        return Long.parseLong(result);
    }

}
