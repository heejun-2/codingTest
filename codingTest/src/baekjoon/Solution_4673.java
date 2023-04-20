package baekjoon;

public class Solution_4673 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		boolean[] check = new boolean[10001];
		
		for(int i = 1; i < check.length; i++) {
			int n = d(i);
			
			if(n < 10001) {
				check[n] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i < check.length; i++) {
			if(!check[i]) {
				sb.append(i).append("\n");
			}
		}
		
		System.out.println(sb.toString());
		

	}

	private static int d(int i) {
		// TODO Auto-generated method stub
		int sum = i;
		
		while(i != 0) {
			sum += i % 10;
			i /= 10;
		}
		
		return sum;
	}

}
