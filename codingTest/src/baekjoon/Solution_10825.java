package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_10825 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String[][] arr = new String[N][4];
		
		for(int i = 0; i < N; i++) {
			arr[i] = br.readLine().split(" ");
		}
		
		Arrays.sort(arr, (e1, e2) -> {
			if(Integer.parseInt(e1[1]) == Integer.parseInt(e2[1])) {
				if(Integer.parseInt(e1[2]) == Integer.parseInt(e2[2])) {
					if(Integer.parseInt(e1[3]) == Integer.parseInt(e2[3])) {
						return e1[0].compareTo(e2[0]);
					}
					
					return Integer.parseInt(e2[3]) - Integer.parseInt(e1[3]);
				}
				
				return Integer.parseInt(e1[2]) - Integer.parseInt(e2[2]);
			}
			return Integer.parseInt(e2[1]) - Integer.parseInt(e1[1]);
		});
		
		for(int i = 0; i < N; i++) {
			System.out.println(arr[i][0]);
		}

	}

}
