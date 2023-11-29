import java.util.ArrayList;
import java.util.List;


class Solution {
	
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        //3*2 2*3 --> 3*3 >> arr1의 row, arr2의 col
        //arr1의 로우리스트 저장용
        List<List<Integer>> row1 = new ArrayList<List<Integer>>();
        
        //arr2의 칼럼리스트 저장용
        List<List<Integer>> col1 = new ArrayList<List<Integer>>();
        //arr1 rowList
        //arr2 colList
//        [row][col]
        //arr.length << row
        //arr[n].length << col
        //rowlist
        
        for(int row = 0; row < arr1.length  ;row++) {
        	List<Integer> list = new ArrayList<Integer>();
        	//저장시작
        	for(int a = 0; a < arr1[row].length; a++) {
        		list.add(arr1[row][a]);
        	}
        	row1.add(list);
        }
        
        //칼럼은 고정 로우를 계속 증가후 가 끝내면 다시 칼럼증가
        for(int col = 0; col < arr2[0].length; col++) {
        	List<Integer> list = new ArrayList<Integer>();
        	for(int a = 0; a < arr2.length; a++) {
        		list.add(arr2[a][col]);
        	}
        	col1.add(list);
        }
        int n  = row1.get(0).size();
        for(int a = 0; a < row1.size(); a++) {
        	for(int b = 0; b < col1.size(); b++) {
//        		row1.get(a) , col1.get(b) 의 숫잘들 각각 곱해서 answer[a][b] 에 삽입
        		int sum = 0;
        		for(int i = 0; i < n; i++) {
        			sum += row1.get(a).get(i)*col1.get(b).get(i);
        		}
        		answer[a][b] = sum;
        	}
        }
        
        return answer;
    }
}
