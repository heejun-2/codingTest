package programmers;

import java.util.Arrays;

public class Solution_141 {
    // 최댓값 만들기(1)
    public int solution(int[] numbers) {
        Arrays.sort(numbers);

        int answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];

        return answer;
    }
}
