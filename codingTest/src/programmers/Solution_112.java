package programmers;

import java.util.HashMap;
import java.util.Map;

public class Solution_112 {
    // 전화번호 목록
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Map<String, Integer> map = new HashMap<>();
        for(String s : phone_book){
            map.put(s, 1);
        }

        for(int i = 0; i < map.size(); i++){
            for(int j = 1; j < phone_book[i].length(); j++){
                if(map.containsKey(phone_book[i].substring(0,j))){
                    return false;
                }
            }
        }

        return answer;
    }
}
