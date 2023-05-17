package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution_5948 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			int[] arr = new int[7];
			
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int i = 0; i < 7; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			HashSet<Integer> h = new HashSet<>();
			
			for(int i = 0; i < arr.length - 2; i++) {
				for(int j = i+1; j < arr.length - 1; j++) {
					for(int k = j+1; k < arr.length; k++) {
						int tmp = arr[i]+arr[j]+arr[k];
						h.add(tmp);
					}
				}
			}
			
			LinkedList<Integer> l = new LinkedList<>(h);
			
			Collections.sort(l);
			
			sb.append("#"+tc+" "+l.get(l.size()-5)).append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
