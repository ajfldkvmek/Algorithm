class Solution {
    public String solution(String s) {
        String answer = "";
        
        boolean flag = true;
        char[] ch = new char[s.length()];

        ch = s.toCharArray();

        for(int i = 0; i < ch.length; i++){

            if(ch[i]==' ') {
                flag=true;
                continue;
            }

            else if(flag) {
                ch[i] = Character.toUpperCase(ch[i]);
            }
            else {
                ch[i] = Character.toLowerCase(ch[i]);
            }

            flag=!flag;
        }

        answer = String.valueOf(ch);
        return answer;
    }
}