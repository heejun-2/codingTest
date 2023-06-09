package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_10828 {

	public static int[] stack;
	public static int size = 0;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		stack = new int[N];
		
		StringTokenizer st;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			switch(st.nextToken()) {
				case "push":
					push(Integer.parseInt(st.nextToken()));
					break;
				
				case "pop":
					sb.append(pop()).append("\n");
					break;
				
				case "size":
					sb.append(size()).append("\n");
					break;
					
				case "empty":
					sb.append(empty()).append("\n");
					break;
					
				case "top":
					sb.append(top()).append("\n");
					break;
					
				default:
					break;
			}
			
			
		}
		System.out.println(sb.toString());
	}
	
	public static void push(int tmp) {
		stack[size++] = tmp;
	}
	
	public static int pop() {
		if(size == 0) {
			return -1;
		}
		else {
			int tmp = stack[size - 1];
			stack[size - 1] = 0;
			size--;
			return tmp;
		}
	}
	
	public static int size() {
		return size;
	}
	
	public static int empty() {
		if(size == 0) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public static int top() {
		if(size == 0) {
			return -1;
		}
		else {
			return stack[size - 1];
		}
	}
	
	

}
