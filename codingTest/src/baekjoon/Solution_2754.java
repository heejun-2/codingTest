package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2754 {
	// 학점계산
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String grade = br.readLine();
		
		String[] arr = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D+", "D0", "D-", "F"};
		double[] score = {4.3, 4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0};
		
		int idx = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(grade.equals(arr[i])) {
				idx = i;
				break;
			}
		}
		
		System.out.println(score[idx]);

	}

}
