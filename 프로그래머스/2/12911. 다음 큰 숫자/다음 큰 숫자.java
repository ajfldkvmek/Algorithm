class Solution {
	
//	public static void main(String[] args) {
//		Solution s = new Solution();
//		
//		int res = s.solution(15);
//		System.out.println(res);
//	}
	
	public int solution(int n) {
		int answer = n;
		//n의 1의 개수
		int num = getOne(n);
//		String str = getOne(n);
		while(true) {
			answer++;
			if(getOne(answer) == num) {
				break;
			}
//			answer++;
//			if(str.equals(getOne(answer))) break;;
		}
		return answer;
	}
	
	//2진법으로 바꾼 후 1 개수 출력
	public int getOne(int n) {
		
		String str = Integer.toBinaryString(n);
//		str = str.replaceAll("0", "");
		char[] cArr = str.toCharArray();
		int num = 0;
		for(char ch : cArr)
			if(ch=='1') num++;
		return num;
	}
}