package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1945 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			
			int[] arr = new int[5];
			int[] divide = {2, 3, 5, 7, 11};
			
			while(true) {
				for(int i = 0; i < 5; i++) {
					if(N % divide[i] == 0) {
						arr[i]++;
						N /= divide[i];
					}
				}
				
				if(N == 1) {
					break;
				}
			}
			
			sb.append("#"+tc+" ");
			for(int i = 0; i < arr.length; i++) {
				sb.append(arr[i]+" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
