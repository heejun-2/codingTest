package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_10815 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < M; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			
			if(binarySearch(arr, tmp)) {
				sb.append("1 ");
			}else {
				sb.append("0 ");
			}
		}
		
		System.out.println(sb.toString());
		
	}

	private static boolean binarySearch(int[] arr, int tmp) {
		// TODO Auto-generated method stub
		int left = 0;
		int right = arr.length-1;
		int mid;
		
		while(left <= right) {
			 mid = (left + right) / 2;
			 if(arr[mid] < tmp) {
				 left = mid + 1;
			 }
			 else if(arr[mid] > tmp) {
				 right = mid - 1;
			 }
			 else {
				 return true;
			 }
		}
		
		return false;
	}

}
