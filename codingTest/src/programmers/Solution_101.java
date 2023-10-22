package programmers;

import java.util.HashMap;
import java.util.Map;

public class Solution_101 {
    // 할인 행사
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int days = 10;

        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < want.length; i++){
            map.put(want[i], number[i]);
        }

        for(int i = 0; i < discount.length - days + 1; i++){
            Map<String, Integer> check = new HashMap<>();
            for(int j = 0; j < days; j++){
                check.put(discount[i + j], check.getOrDefault(discount[i + j], 0) + 1);
            }

            boolean isPass = true;
            for(String key : map.keySet()){
                if(map.get(key) != check.get(key)){
                    isPass = false;
                    break;
                }
            }

            answer += isPass ? 1 : 0;
        }

        return answer;
    }
}
