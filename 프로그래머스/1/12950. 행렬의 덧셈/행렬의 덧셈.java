class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int a = 0; a < arr1.length; a++){
            for(int b = 0; b < arr1[a].length; b++){
                answer[a][b] = arr1[a][b]+arr2[a][b];
            }
        }
        return answer;
    }
}