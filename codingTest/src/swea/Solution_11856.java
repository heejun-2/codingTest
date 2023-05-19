package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_11856 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			String s = br.readLine();
			
			char[] arr = s.toCharArray();
			
			Arrays.sort(arr);
			
			boolean isPass = false;
			
			if(arr[0] == arr[1] && arr[1] != arr[2] && arr[2] == arr[3]) {
				isPass = true;
			}
			
			sb.append("#"+tc+" ");
			if(isPass) {
				sb.append("Yes");
			}else {
				sb.append("No");
			}
			sb.append("\n");
			
		}
		
		System.out.println(sb.toString());

	}

}
