package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_25314 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int num = N / 4;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < num; i++) {
			sb.append("long"+" ");
		}
		sb.append("int");
		
		System.out.println(sb.toString());

	}

}
