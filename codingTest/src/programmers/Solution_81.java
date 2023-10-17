package programmers;

public class Solution_81 {
	// [1차] 다트 게임
	public int solution(String dartResult) {
        int answer = 0;
        
        String s = "";
        int[] arr = new int[3];
        int idx = 0;
        
        for(int i = 0; i < dartResult.length(); i++){
            switch(dartResult.charAt(i)){
                case 'S':
                    arr[idx] = (int) Math.pow(Integer.parseInt(s), 1);
                    idx++;
                    s = "";
                    break;
                case 'D':
                    arr[idx] = (int) Math.pow(Integer.parseInt(s), 2);
                    idx++;
                    s = "";
                    break;
                case 'T':
                    arr[idx] = (int) Math.pow(Integer.parseInt(s), 3);
                    idx++;
                    s = "";
                    break;
                case '*':
                    arr[idx-1] *= 2;
                    if(idx > 1){
                        arr[idx-2] *= 2;
                    }
                    break;
                case '#':
                    arr[idx-1] *= -1;
                    break;
                default:
                    s += String.valueOf(dartResult.charAt(i));
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        
        return answer;
    }

}
