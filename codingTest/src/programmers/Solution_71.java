package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class Solution_71 {
    // 명예의 전당(1)
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < score.length; i++){
            arrayList.add(score[i]);

            if(arrayList.size() > k){
                arrayList.remove(Collections.min(arrayList));
            }

            answer[i] = Collections.min(arrayList);
        }

        return answer;
    }
}
