package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution_28278 {
    // 스택 2
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int command = Integer.parseInt(st.nextToken());

            if(command == 1){
                int tmp = Integer.parseInt(st.nextToken());
                stack.push(tmp);
            }
            else if(command == 2){
                if(stack.isEmpty()){
                    sb.append(-1);
                }
                else{
                    sb.append(stack.pop());
                }
                sb.append("\n");
            }
            else if(command == 3){
                sb.append(stack.size()).append("\n");
            }
            else if(command == 4){
                if(stack.isEmpty()){
                    sb.append(1);
                }
                else{
                    sb.append(0);
                }
                sb.append("\n");
            }
            else if(command == 5){
                if(stack.isEmpty()){
                    sb.append(-1);
                }
                else{
                    sb.append(stack.peek());
                }
                sb.append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
