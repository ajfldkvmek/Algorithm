class Solution {

	public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		int idx = 0;
		
		for(int i = 0; i < prices.length-1; i++) {
			int count = 0;
			for(int j = i+1; j < prices.length; j++) {
				count++;
				if(prices[i] > prices[j]) {
					break;
				}
			}
			answer[idx] = count;
			idx++;
		}
		answer[prices.length-1] = 0;
		
		return answer;
	}
}