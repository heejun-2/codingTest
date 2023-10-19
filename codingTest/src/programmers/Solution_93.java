package programmers;

import java.util.ArrayList;
import java.util.List;

public class Solution_93 {
	// 영어 끝말잇기
	public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        List<String> list = new ArrayList<String>();
        list.add(words[0]);
        boolean flag = true;
        
        for(int i = 1; i < words.length; i++){
            if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)
               || list.contains(words[i])){
                answer[0] = (i % n) + 1;	// 번호
                answer[1] = (i / n) + 1;	// 차례
                flag = false;
                break;
            }
            
            list.add(words[i]);
        }

        return answer;
    }

}
