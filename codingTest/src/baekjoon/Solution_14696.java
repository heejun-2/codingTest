package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_14696 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 0; i < N; i++) {
			int[] Aarr = new int[5];
			int[] Barr = new int[5];
			
			for(int j = 0; j < 2; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				int a = Integer.parseInt(st.nextToken());
				
				for(int k = 0; k < a; k++) {
					int tmp = Integer.parseInt(st.nextToken());
					if(j == 0) {
						Aarr[tmp]++;
					}else {
						Barr[tmp]++;
					}
				}
				
			}
			
			int result = 0;
			
			for(int j = Aarr.length -1; j >= 0; j--) {
				if(Aarr[j] > Barr[j]) {
					result = 1;
					sb.append("A").append("\n");
					break;
				}
				else if(Aarr[j] < Barr[j]) {
					result = -1;
					sb.append("B").append("\n");
					break;
				}
			}
			
			if(result == 0) {
				sb.append("D").append("\n");
			}
			
			
		}
		
		System.out.println(sb.toString());

	}

}
