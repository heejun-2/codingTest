package programmers;

import java.util.HashMap;

public class Solution_113 {
    // [1차]뉴스 클러스터링
    public int solution(String str1, String str2) {
        double union = 0;   // 합집합 갯수
        double inter = 0;   // 교집합 갯수
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        for(int i = 0; i < str1.length() - 1; i++){
            String s = str1.substring(i, i + 2).replaceAll("[^A-Z]","");
            if(s.length() < 2) continue;
            map1.put(s, map1.getOrDefault(s, 0) + 1);
        }
        for(int i = 0; i < str2.length() - 1; i++){
            String s = str2.substring(i, i + 2).replaceAll("[^A-Z]","");
            if(s.length() < 2) continue;
            map2.put(s, map2.getOrDefault(s, 0) + 1);
        }

        if(map1.isEmpty() && map2.isEmpty())
            return 65536;

        for(String key : map1.keySet()){
            if(map2.containsKey(key)){
                union += Math.max(map1.get(key), map2.get(key));
                inter += Math.min(map1.get(key), map2.get(key));
                map2.remove(key);
            }
            else{
                union += map1.get(key);
            }
        }

        for(String key : map2.keySet()){
            union += map2.get(key);
        }

        return (int)Math.floor((inter / union) * 65536);
    }
}
