package baekjoon;

import java.util.Scanner;

public class Solution_2864 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String A = sc.nextInt() + "";
		String B = sc.nextInt() + "";
		String Amin = "";
		String Amax = "";
		String Bmin = "";
		String Bmax = "";
		for(int i = 0; i < A.length(); i++) {
			Amin = A.replace('6', '5');
			Amax = A.replace('5', '6');
		}
		for(int i = 0; i < B.length(); i++) {
			Bmin = B.replace('6', '5');
			Bmax = B.replace('5', '6');
		}

		System.out.print((Integer.parseInt(Amin)+Integer.parseInt(Bmin))+" "+(Integer.parseInt(Amax)+Integer.parseInt(Bmax)));
	}

}
