package programmers;

import java.util.Arrays;

public class Solution_103 {
    // H-Index
    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        for(int i = 0; i < citations.length; i++){
            int cnt = citations.length - i;
            if(citations[i] >= cnt){
                answer = cnt;
                break;
            }
        }

        return answer;
    }
}
