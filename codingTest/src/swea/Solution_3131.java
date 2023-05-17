package swea;

import java.io.IOException;

public class Solution_3131 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		
		for(int i = 2; i <= 1000000; i++) {
			boolean isPass = true;
			
			for(int j = 2; j <= Math.sqrt(i); j ++) {
				if(i % j == 0) {
					isPass = false;
					break;
				}
			}
			
			if(isPass) {
				sb.append(i+" ");
			}
		}
		
		System.out.println(sb.toString());
	}

}
