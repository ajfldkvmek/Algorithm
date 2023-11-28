class Solution {    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0; //지워진0의 수
        int round = 0; //반복 횟수
        
        /*
         *  1. s의 0제거+지운 수 저장
         *  2. 0이 제거된 후의 길이(len)를 다시 이진수로 변경
         *  3. s가 1이될 때 까지 반복, 반복횟수 출력
         */
        while(true) {
        	if(s.equals("1")) break;
        	String str = deleteZero(s);
            count += s.length()-str.length(); //len: 지워진0의 수
            int len = str.length();
            s = toBinary(len);
            round++;
        }
        answer[0] = round;
        answer[1] = count;
        return answer;
    }
    
    public String deleteZero(String s) {
    	String str = s.replaceAll("0", "");
    	return str;
    }
    
    //len입력받아 2진수로 변경
    public String toBinary(int num) {
    	String str = Integer.toBinaryString(num);
    	return str;
    }
}