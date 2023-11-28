import java.util.Deque;
import java.util.LinkedList;

public class Solution {
//	b aa baa → bb aa → aa →

/*	어떻게 풀기?
 *  1. LL로 값 저장해서 지우기? x
 *  2. 스트링값 받아오면서 지우기? x
 *  3. 스택으로 풀기?
 *  
 *  
 */
	private Deque<Character> stack = new LinkedList<>();

	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public void push(Character ch) {
		stack.push(ch);
	}
	
	public Character pop() {
		if(stack.isEmpty()) {
			System.out.println("stack underflow");
		}
		return stack.pop();
	}
	
	public Character peek() {
		if(stack.isEmpty()) {
			System.out.println("stack underflow");
		}
		return stack.peek();
	}
	
	public int solution(String s) {
		
		Solution stack = new Solution();
		
		int answer = 0;
		char[] cArr = s.toCharArray();
		
		for(char ch : cArr) {
			if(stack.isEmpty()) {
				stack.push(ch);
				continue;
			}
			
			if(stack.peek() == ch) {
				stack.pop();
			} else {
				stack.push(ch);
			}
		}
		
		if(stack.isEmpty()) answer = 1;
		return answer;
	}
	
//	public static void main(String[] args) {
//		Solution s= new Solution();
//	}
}
