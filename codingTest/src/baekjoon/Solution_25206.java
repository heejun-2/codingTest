package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_25206 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] grade = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
		double[] score = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};
		
		StringTokenizer st;
		
		double total = 0;
		double result = 0;
		
		for(int i = 0; i < 20; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			String obj =  st.nextToken();
			double num = Double.parseDouble(st.nextToken());
			String s = st.nextToken();
			
			
			for(int j = 0; j < grade.length; j++) {
				if(grade[j].equals(s)) {
					total += score[j] * num;
					if(j != 9) {
						result += num;
					}
				}
			}
			
		}
		
		double aver = total / result;
		
		System.out.printf("%.6f\n", aver);

	}

}
