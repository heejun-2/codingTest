package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_25501 {

    static int count = 0;
    
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	for(int i = 0; i < T; i++) {
    		String str = br.readLine();
    		count = 0;
    		sb.append(isPalindrome(str)).append(" ").append(count).append("\n");
    	}
    	br.close();
    	System.out.println(sb.toString());

    }
    
    public static int recursion(String s, int l, int r){
    	count++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    
    public static int isPalindrome(String s){
    	int count = 0;
        return recursion(s, 0, s.length()-1);
    }

}
