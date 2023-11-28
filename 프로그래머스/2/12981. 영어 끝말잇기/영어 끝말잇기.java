
import java.util.HashSet;
import java.util.Set;

/*
 *	끝말있기
 *	사람수n, 단어집합 words 
 */
public class Solution {

//	static Map<String, Integer> words = new HashMap<String, Integer>();
	static Set<String> word = new HashSet<String>();
	
    public int[] solution(int n, String[] words) {
       
    	int[] answer = {0, 0};
    	//n	   : 사람수
    	//words: 말한 단어들
    	//순서
    	//1.단어 입력받기
    	//2.그전단어의 끝 char랑 비교
    	//3.그전에 있던 단어들과 중복체크 << map이나 set으로
    	int count = 0;
    	int chk = 0; //오류체크
    	for(int i = 0; i < words.length; i++) {
    		//count++;(진행수)
    		//i == 0이면 일단 set에 add
    		//그 이후에 단어 비교해가면서 앞뒤 맞으면 add<< 이건 words랑 비교, 
    		//안맞으면 바로 break;
    		//set의 size와 count비교해서 다르면 break;
//    		System.out.println(count);
    		count++;
    		if(i == 0) {
    			word.add(words[i]);
    			continue;
    		}
    		if(words[i-1].charAt(words[i-1].length()-1) == 
    				words[i].charAt(0)) {
    			word.add(words[i]);
    			//단어 끝과 시작 비교해서 일치하면 add
    		} else {
    			chk++;
    			break;
    		}
    		
    		if(word.size() != count) {
    			chk++;
    			break;
    		}
    	}
    	
    	//0이 아니면 사람이랑 번째 반환
    	if(chk != 0) {
    		//count << 횟수
    		System.out.println(count + " " + n);
    		int a = count/n + 1; //번째 라운드
    		int b = count%n;//나머지(0이면 n이 잘못)
    		if(count%n == 0) {
    			a--;
    			b = n;
    		}
    		
    		answer[0] = b;
    		answer[1] = a;
    		System.out.println(answer[0] +" " + answer[1]);
    	}
    	
        return answer;
    }
    
//    public static void main(String[] args) {
//	
//    	String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
//    	Solution s = new Solution();
//    	
//    	s.solution(3, words);
////    	for(int a : s.solution(3, words))
////    		System.out.println(a);
//	}
}
