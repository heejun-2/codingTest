package programmers;

import java.util.Arrays;

public class Solution_158 {
	// 특이한 정렬
	public int[] solution(int[] numlist, int n) {
        Arrays.sort(numlist);
        
        for(int i = 0; i < numlist.length; i++) {
        	for(int j = 0; j < numlist.length; j++) {
        		if(Math.abs(n - numlist[i]) <= Math.abs(n - numlist[j])) {
        			int tmp = numlist[i];
        			numlist[i] = numlist[j];
        			numlist[j] = tmp;
        		}
        	}
        }
        
        return numlist;
    }

}
