import java.util.Arrays;

class Solution {

//	public static void main(String[] args) {
//		
//		Solution s = new Solution();
//		int[] people = {70, 50, 80, 50};
//		int limit = 100;
//		
//		int num = s.solution(people, limit);
//		
//		System.out.println(num);
//	}
	
	public int solution(int[] people, int limit) {
		int answer = 0; // 보트수
		// limit는 무게 제한 2명이최대 << 항상 최대랑 최소의 합과 보트무게제한 limit를 비교해서

		Arrays.sort(people);
		int max = people.length-1;
		int min = 0;
		while (true) {
			if(min > max) break;
			else if(max == min) {
				answer++;
				break;
			} else {
				if((people[min] + people[max]) <= limit ) {
					min++;
					max--;
					answer++;
				} else {
					max--;
					answer++;
				}
			}
		}
		return answer;
	}
}
