package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1357 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String X = st.nextToken();
		String Y = st.nextToken();
		
		int result = Rev((Rev(X) + Rev(Y))+"");
		
		System.out.println(result);
	}

	private static int Rev(String s) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(s);
		
		int num = Integer.parseInt(sb.reverse().toString());
		
		return num;
	}



}
