package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_25304 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int total = Integer.parseInt(br.readLine());
		int cnt = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 0; i < cnt; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int price = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			
			total -= price * num;
		}
		
		if(total == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
