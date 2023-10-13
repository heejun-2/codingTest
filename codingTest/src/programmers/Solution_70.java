package programmers;

public class Solution_70 {
	// 추억 점수
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for(int i = 0; i < photo.length; i++){
            int sum = 0;
            for(int j = 0; j < name.length; j++){
                for(int k = 0; k < photo[i].length; k++){
                    if(name[j].equals(photo[i][k])){
                        sum += yearning[j];
                        break;
                    }
                }
            }
            answer[i] = sum;
        }
        return answer;
    }

}
