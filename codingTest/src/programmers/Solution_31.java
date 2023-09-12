package programmers;

public class Soluiton_31 {
	// 문자열 내 p와 y의 개수
	boolean solution(String s) {
        int p = 0;
        int y = 0;
        
        s = s.toLowerCase();

        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p'){
                p++;
            }
            if(s.charAt(i) == 'y'){
                y++;
            }
        }
        
        if(p == y){
            return true;
        }else{
            return false;
        }

    }

}
