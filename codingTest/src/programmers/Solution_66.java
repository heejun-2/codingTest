package programmers;

public class Solution_66 {
    // 가장 가까운 같은 글자
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        answer[0] = -1;

        for(int i = 1; i < s.length(); i++){
            char c = s.charAt(i);
            boolean isPass = false;

            for(int j = i - 1; j >= 0; j--){
                char target = s.charAt(j);
                if(c == target){
                    answer[i] = i - j;
                    isPass = true;
                    break;
                }
            }

            if(!isPass) answer[i] = -1;
        }

        return answer;
    }
}
