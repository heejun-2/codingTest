package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1204 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			int[] arr = new int[101];
			
			int N = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int i = 0; i < 1000; i++) {
				int tmp = Integer.parseInt(st.nextToken());
				arr[tmp]++;
			}
			
			int max = 0;
			int result = 0;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] >= max) {
					max = arr[i];
					result = i;
				}
			}
			

			
			sb.append("#"+tc+" "+result).append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
