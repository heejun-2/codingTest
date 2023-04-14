package baekjoon;

import java.util.Scanner;

public class Solution_25501 {

    public static String recursion(String s, int l, int r, int count){
    	count++;
        if(l >= r) return 1+" "+count;
        else if(s.charAt(l) != s.charAt(r)) return 0+" "+count;
        else return recursion(s, l+1, r-1, count);
    }
    public static String isPalindrome(String s){
    	int count = 0;
        return recursion(s, 0, s.length()-1, count);
    }
    
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	
    	int T = sc.nextInt();
    	
    	for(int i = 0; i < T; i++) {
    		String str = sc.next();
    		System.out.println(isPalindrome(str));
    	}

    }

}
