package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Solution_11652 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		HashMap<Long, Integer> map = new HashMap<>();
		
		int max = 0;
		long result = 0;
		
		for(int i = 0; i < N; i++) {
			long card = Long.parseLong(br.readLine());
			
			map.put(card, map.getOrDefault(card, 0) + 1);
			
			if(map.get(card) > max) {
				max = map.get(card);
				result = card;
			}
			else if(map.get(card) == max) {
				result = Math.min(result, card);
			}
		}
		
		System.out.println(result);

	}

}
