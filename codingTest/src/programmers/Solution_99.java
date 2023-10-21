package programmers;

import java.util.HashSet;
import java.util.Set;

public class Solution_99 {
    // 연속 부분 수열 합의 갯수
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();

        for(int size = 1; size <= elements.length; size++){
            for(int i = 0; i < elements.length; i++){
                int sum = 0;
                for(int j = i; j < i + size; j++){
                    sum += elements[j % elements.length];
                }
                set.add(sum);
            }
        }

        return set.size();
    }
}
