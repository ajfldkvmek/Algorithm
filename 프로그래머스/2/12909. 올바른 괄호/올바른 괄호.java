import java.util.Deque;
import java.util.LinkedList;

public class Solution {

	private Deque<Character> stack = new LinkedList<>();
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}	
	
	public void push(char ch) {
		stack.push(ch);
	}
	
	public char pop() {
		if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.pop();
	}
	
	public char peek() {
		if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.peek();
	}
	
	boolean solution(String s) {
		
		Solution stack = new Solution();
		
		boolean answer = true;
		
		char[] cArr = s.toCharArray();
		if(cArr[0] == ')') return !answer;
		
		for(int i = 0; i < cArr.length; i++) {
			// (면 push, )면 pop
			// 과정 수행 후 stack이 empty면 참 아니면 거짓
			// cArr의 시작이 )이면 잘못
			
			if(cArr[i] == '(') stack.push(cArr[i]);
			else {
				if(stack.isEmpty()) {
					answer = false;
					break;
				} else {
					stack.pop();
				}
			}
		}
        //다 끝나고 길이체크
		if(!stack.isEmpty()) answer = false;
        
		return answer;
	}
}