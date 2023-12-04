import java.util.Deque;
import java.util.LinkedList;

class Solution {
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

	// 1.문자열 회전시키는 함수
	// 2.올바른 열인지 확인하는 함수
	public int solution(String s) {
		int answer = 0;

		char[] cArr = new char[s.length()];
		cArr = s.toCharArray();

		for (int i = 0; i < cArr.length; i++) {
			//스택 초기화
			stack.clear();
		
			// 문자열이 제대로된 놈인지 확인(제대로된 문자열이면 1이 리턴)
			answer += chk(cArr);
			
			// 문자열 회전
			rotate(cArr);
		}
		return answer;
	}

//	문자열 회전
	public char[] rotate(char[] cArr) {

		char temp = cArr[0];

		for (int i = 0; i < cArr.length - 1; i++) {
			cArr[i] = cArr[i + 1];
		}
		cArr[cArr.length - 1] = temp;

		return cArr;
	}

	// 옳은 문자열인지 체크
	public int chk(char[] cArr) {
		int result = 0;
		for (int i = 0; i < cArr.length; i++) {

			if(cArr[i] == '}' ) {
				if(stack.isEmpty()) {
					result++;
					break;
				}
				if(stack.peek() == '{') stack.pop();
			}
			
			else if(cArr[i] == ']' ) {
				if(stack.isEmpty()) {
					result++;
					break;
				}
				if(stack.peek() == '[') stack.pop();
			}
			
			else if(cArr[i] == ')' ) {
				if(stack.isEmpty()) {
					result++;
					break;
				}
				if(stack.peek() == '(') stack.pop();
			}
			
			else {
				stack.push(cArr[i]);
			}
		}
		
		if(result == 0 && stack.isEmpty()) return 1;
		else return 0;
	}
}