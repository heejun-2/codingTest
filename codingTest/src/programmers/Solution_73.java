package programmers;

public class Solution_73 {
    // 2016년
    public String solution(int a, int b) {
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int number = 0;

        for(int i = 0; i < a - 1; i++){
            number += month[i];
        }

        number += b - 1;

        return day[number % 7];
    }

}
