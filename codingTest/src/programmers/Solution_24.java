package programmers;

public class Solution_24 {
	// 마지막 두 원소
	public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        
        int length = answer.length;
        
        for(int i = 0; i < num_list.length; i++){
            answer[i] = num_list[i];
        }
        
        if(answer[length-2] > answer[length-3]){
            answer[length-1] = answer[length-2] - answer[length-3];
        }else{
            answer[length-1] = answer[length-2] * 2;
        }
        
        return answer;
    }

}
