package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_11557 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		String[] school = new String[T];
		
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			String[][] arr = new String[N][2];
			StringTokenizer st;
			int max = 0;
			int idx = -1;
			for(int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				arr[j][0] = st.nextToken();
				arr[j][1] = st.nextToken();
				if(max < Integer.parseInt(arr[j][1])) {
					max = Integer.parseInt(arr[j][1]);
					idx = j;
				}
			}
			school[i] = arr[idx][0];
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < T; i++) {
			sb.append(school[i]).append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
