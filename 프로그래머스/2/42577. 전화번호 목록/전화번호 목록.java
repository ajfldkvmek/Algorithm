import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        //1.같은 번호 중복x
        //2.접두어인지 판단
        //3.정렬해서 풀자

        Arrays.sort(phone_book);

        for(int i = 0; i < phone_book.length-1; i++) {

            for(int j = i+1; j < phone_book.length; j++ ){

                if(phone_book[i].charAt(0) != phone_book[j].charAt(0)) break;
                if(phone_book[i].length() >= phone_book[j].length()) break;
                if(phone_book[j].startsWith(phone_book[i])) {
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }
}