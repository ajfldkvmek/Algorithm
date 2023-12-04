import java.util.ArrayList;
import java.util.List;
//primenumber
class Solution {
//	n:10진수 숫자, k:바꿀 진수
	static List<Long> list = new ArrayList<>();
	
    public int solution(int n, int k) {
        int answer = 0;
        
        String str = Long.toString(n, k);
        
        String[] sArr = str.split("0");
       
        for (String s : sArr) {
			if(s.equals("")) continue;
			if(s.equals("1")) continue;
			list.add( Long.parseLong(s) );
		}
        
        for(int i = 0; i < list.size(); i++) {
//        	System.out.println(list.get(i));
        	long num = list.get(i);
        	if(num == 2) {
        		answer++;
        		continue;
        	}
        	if(num % 2 ==0) continue;
        	
        	else {
        		int chk = 0;
        		for(long q = 3; q <= Math.sqrt(num); q+=2) {
        			if(num % q == 0) {
        				chk++;
        				break;
        			}
        		}
        		
        		if(chk != 0) {
        			continue;
        		}
        		answer++;
        	}
        }
        return answer;
    }
}