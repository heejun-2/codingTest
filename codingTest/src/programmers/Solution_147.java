package programmers;

import java.util.Arrays;

public class Solution_147 {
    // 최댓값 만들기(2)
    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        int num1 = numbers[0] * numbers[1];
        int num2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];

        answer = Math.max(num1, num2);

        return answer;
    }
}
