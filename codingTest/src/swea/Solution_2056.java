package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2056 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for(int i = 1; i <= T; i++) {
			String s = br.readLine();
			String year = s.substring(0, 4);
			String month = s.substring(4, 6);
			String day = s.substring(6);
			
			if(Integer.parseInt(month) >= 1 && Integer.parseInt(month) < 13 
					&& Integer.parseInt(day) >= 1 && Integer.parseInt(day) <= days[Integer.parseInt(month)]) {
				System.out.println("#"+i+" "+year+"/"+month+"/"+day);
			}else {
				System.out.println("#"+i+" "+-1);
			}
		}

	}

}
