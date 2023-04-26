package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2947 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[5];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		boolean isPass = true;
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			for(int i = 0; i < 4; i++) {
				
				if(arr[0] == 1 && arr[1] == 2 && arr[2] == 3 && arr[3] == 4 && arr[4] == 5) {
					isPass = false;
					break;
				}
				
				if(arr[i] > arr[i+1]) {
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
					
					for(int j = 0; j < 5; j++) {
						sb.append(arr[j]).append(" ");
					}
					sb.append("\n");
				}

			}
			
			if(!isPass) {
				break;
			}
		}
		
		System.out.println(sb.toString());

	}

}
