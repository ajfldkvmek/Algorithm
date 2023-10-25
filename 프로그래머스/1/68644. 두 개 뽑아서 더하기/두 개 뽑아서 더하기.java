import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> l = new ArrayList();
        List<Integer> l2 = new ArrayList();
        for(int a = 0; a < numbers.length-1; a++){
            for(int b = a+1; b < numbers.length; b++){
                l.add(numbers[a]+numbers[b]);
            }
        }
        
        for(int i =0; i <l.size(); i++){
            if(!l2.contains(l.get(i))) l2.add(l.get(i));
        }
        
                        
        answer = new int[l2.size()];
        
        for(int i = 0; i < answer.length; i++)
            answer[i] = l2.get(i);
        
        Arrays.sort(answer);
        return answer;
    }
}