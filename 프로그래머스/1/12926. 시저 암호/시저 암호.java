class Solution {
    public String solution(String s, int n) {

        String answer = "";
        char[] ch = s.toCharArray();
        for(int a = 0; a < ch.length; a++) {
        	//1.소문자
        	if(ch[a] >= 'a' && ch[a] <= 'z') {
        		if((char)ch[a]+n > 'z') ch[a] = (char) (ch[a] + n -26);
        		else ch[a] = (char) (ch[a] + n);
        	}
        	//2.대문자
        	else if(ch[a] >= 'A' && ch[a] <= 'Z') {
        		if((char)ch[a]+n > 'Z') ch[a] = (char) (ch[a] + n -26);
        		else ch[a] = (char) (ch[a] + n);
        	}
        	//3.그 외
        	else continue;
        }   
               
        for(char c : ch)
        	answer += c;

        return answer;
    }
}