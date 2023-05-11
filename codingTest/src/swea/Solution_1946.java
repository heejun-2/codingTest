package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1946 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			
			char[] alpha = new char[N];
			int[] arr = new int[N];
			
			int cnt = 0;
			
			for(int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				alpha[i] = st.nextToken().charAt(0);
				arr[i] = Integer.parseInt(st.nextToken());
				cnt += arr[i];
			}
			
			char[] result = new char[cnt];
			
			int idx = 0;
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < arr[i]; j++) {
					result[idx++] = alpha[i];
				}
			}
			
			sb.append("#"+tc).append("\n");
			for(int i = 0; i < cnt; i++) {
				if(i != 0 && i % 10 == 0) {
					sb.append("\n");
				}
				sb.append(result[i]);
			}
			sb.append("\n");

		}
		
		System.out.println(sb.toString());

	}

}
