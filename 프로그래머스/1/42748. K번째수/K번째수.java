import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int count = 0;
        
        for(int a = 0; a < commands.length; a++){
            
            int l = commands[a][0];
            int r = commands[a][1];
            int idx = commands[a][2];
            int[] nArr = new int[r-l+1];
            
            System.arraycopy(array, l-1, nArr, 0, r-l+1);
            Arrays.sort(nArr);
            
            answer[count] = nArr[idx-1];
            count++;
        }
        return answer;
    }
}