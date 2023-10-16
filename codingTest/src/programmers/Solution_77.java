package programmers;

public class Solution_77 {
    // 소수 만들기
    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    int num = nums[i] + nums[j] + nums[k];
                    boolean isPass = true;
                    for(int l = 2; l <= Math.sqrt(num); l++){
                        if(num % l == 0){
                            isPass = false;
                            break;
                        }
                    }
                    if(isPass) answer++;
                }
            }
        }

        return answer;
    }
}
