package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution_1302 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<String, Integer> map = new HashMap<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			
			if(map.containsKey(str)) {
				map.replace(str, map.get(str) + 1);
			}
			else {
				map.put(str, 1);
			}
		}
		
		int max = 0;
		
		for(String s : map.keySet()) {
			max = Math.max(max, map.get(s));
		}
		
		ArrayList<String> al = new ArrayList<String>(map.keySet());
		
		Collections.sort(al);
		
		for(String s : al) {
			if(map.get(s) == max) {
				System.out.println(s);
				break;
			}
		}
	}

}
