package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1244 {
	// 최대 상금
	
	static String[] arr;
	static int cnt, max;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			arr = st.nextToken().split("");
			cnt = Integer.parseInt(st.nextToken());
			
			max = 0;
			if(arr.length < cnt) {
				cnt = arr.length;
			}
			
			dfs(0, 0);
			sb.append("#"+tc+" "+max).append("\n");
		}
		
		System.out.println(sb.toString());

	}
	
	static void dfs(int start, int depth) {
		if(depth == cnt) {
			String result = "";
			for(String s : arr) {
				result += s;
			}
			max = Math.max(max, Integer.valueOf(result));
			
			return;
		}
		
		for(int i = start; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				String str = arr[i];
				arr[i] = arr[j];
				arr[j] = str;
				
				dfs(i, depth + 1);
				
				str = arr[i];
				arr[i] = arr[j];
				arr[j] = str;
			}
		}
	}

}
