package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1920 {

	public static int[] arr;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < M; i++) {
			int key = Integer.parseInt(st.nextToken());
			
			if(binarySearch(key) != -1) {
				sb.append(1).append("\n");
			}
			else {
				sb.append(0).append("\n");
			}
		}
		
		System.out.println(sb.toString());

	}
	
	public static int binarySearch(int key) {
		int lo = 0;
		int hi = arr.length - 1;
		
		while(lo <= hi) {
			int mid = (lo + hi) / 2;
			
			if(key < arr[mid]) {
				hi = mid - 1;
			}
			else if(key > arr[mid]) {
				lo = mid + 1;
			}
			else {
				return mid;
			}
		}
		
		return -1;
	}

}
