class Solution {
    public int solution(int n) {
        
        int answer = 0;
        String str = "";
        int t = 1;
        while (true) {

            if (n < 3) break;

            str += n % 3;
            n /= 3;
        }
        str += n;

        for (int i = str.length(); i >= 1; i--) {
            answer += (str.charAt(i - 1) - '0') * t;
            t *= 3;
        }
        
        return answer;
    }
}