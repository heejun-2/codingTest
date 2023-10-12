package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution_67 {
    // 두 개 뽑아서 더하기
    public int[] solution(int[] numbers) {
        List<Integer> l = new ArrayList<>();

        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i+1; j < numbers.length; j++){
                int tmp = numbers[i] + numbers[j];
                if(!l.contains(tmp)){
                    l.add(tmp);
                }
            }
        }

        Collections.sort(l);

        int[] arr = new int[l.size()];

        for(int i = 0; i < l.size(); i++){
            arr[i] = l.get(i);
        }

        return arr;

    }
}
