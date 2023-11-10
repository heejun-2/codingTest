package programmers;

public class Solution_165 {
	// 배열의 길이에 따라 다른 연산하기
	public int[] solution(int[] arr, int n) {
        if(arr.length % 2 == 0) {
        	for(int i = 1; i < arr.length; i += 2) {
        		arr[i] += n;
        	}
        }
        else {
        	for(int i = 0; i < arr.length; i += 2) {
        		arr[i] += n;
        	}
        }
        
        return arr;
    }

}
