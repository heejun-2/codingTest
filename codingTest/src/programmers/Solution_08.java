package programmers;

public class Solution_08 {
	// 추억 점수
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for(int i = 0; i < photo.length; i++){
            // 해당 사진의 추억점수 = sum
            int sum = 0;
            
            // 각 사진에 찍힌 인물이 name배열에 있는지 확인
            for(int j = 0; j < name.length; j++){
                for(int k = 0; k < photo[i].length; k++){
                    // 있다면 sum에 해당하는 그리움 점수 합산
                    if(name[j].equals(photo[i][k])){
                        sum += yearning[j];
                    }
                }
            }
            answer[i] = sum;
        }
        return answer;
    }

}
