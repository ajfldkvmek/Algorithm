class Solution {
		public String solution(String s) {
		String answer = "";
		char[] cArr = s.toCharArray();
		boolean f = true;
		for (char c : cArr) {
			if (c == ' ') {
				f = true;
				answer += c;
				continue;
			}
			if (f == true) {
				if (c >= 'a' && c <= 'z')
					c = Character.toUpperCase(c);
				f = false;
				answer += c;

			} else {
				if (c >= 'A' && c <= 'Z')
					c = Character.toLowerCase(c);
				f = false;
				answer += c;
			}
		}
		return answer;
	}
}
