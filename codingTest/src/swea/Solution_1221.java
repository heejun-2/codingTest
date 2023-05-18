package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1221 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] alpha = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			String s = st.nextToken();
			
			int N = Integer.parseInt(st.nextToken());
			int[] arr = new int[N];
			
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int i = 0; i < N; i++) {
				String str = st.nextToken();
				for(int j = 0; j < 10; j++) {
					if(str.equals(alpha[j])) {
						arr[i] = j;
						break;
					}
				}
			}
			
			Arrays.sort(arr);
			
			sb.append("#"+tc).append("\n");
			for(int i = 0; i < N; i++) {
				sb.append(alpha[arr[i]]+" ");
			}
			sb.append("\n");
			
		}
		
		System.out.println(sb.toString());

	}

}
