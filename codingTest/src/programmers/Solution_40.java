package programmers;

import java.util.Arrays;

public class Solution_40 {
	// 나누어 떨어지는 숫자 배열(Lv.1)
	public int[] solution(int[] arr, int divisor) {
        
        int count = 0;
        int number = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                count++;
            }
        }
        
        if(count == 0){
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[count];
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[number] = arr[i];
                number++;
            }
        }
        
        Arrays.sort(answer);
        return answer;
        
    }

}
