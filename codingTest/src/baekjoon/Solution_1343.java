package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1343 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		String res = "";
		
		String ans = "";
		String A = "AAAA", B = "BB";
		
		s = s.replaceAll("XXXX", A);
		ans = s.replaceAll("XX", B);
		
		if(ans.contains("X")) {
			res = "-1";
		}else {
			res = ans;
		}
		
		System.out.println(res);

	}

}
