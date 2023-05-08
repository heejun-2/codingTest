package swea;

import java.io.IOException;

public class Solution_2027 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i == j) {
					sb.append("#");
				}else {
					sb.append("+");
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}

}
