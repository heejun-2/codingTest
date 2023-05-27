package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Solution_1269 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		Set<Integer> setA = new HashSet<>();
		Set<Integer> setB = new HashSet<>();

		st = new StringTokenizer(br.readLine(), " ");
		
		while(st.hasMoreTokens()) {
			setA.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		
		while(st.hasMoreTokens()) {
			setB.add(Integer.parseInt(st.nextToken()));
		}
		
		int cnt = 0;
		
		for(int val : setA) {
			if(!setB.contains(val)) {
				cnt++;
			}
		}
		
		for(int val : setB) {
			if(!setA.contains(val)) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
			
	}

}
