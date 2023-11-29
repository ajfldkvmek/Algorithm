import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


class Solution {

	static Map<Integer, Integer> map = new HashMap<>();
	List<Map.Entry<Integer, Integer>> entryList;

	public int solution(int k, int[] tangerine) {
		int answer = 1;
//		8개의 크기가 [1, 3, 2, 5, 4, 5, 2, 3] 이라고 합시다. 경화가 귤 6개를 판매하고 싶다면, 
//		크기가 1, 4인 귤을 제외한 여섯 개의 귤을 상자에 담으면
//		2, 3, 5로 총 3가지가 되며 이때가 서로 다른 종류가 최소일 때입니다.
//		>>index를 할 게 아니라 그냥 몇개냐인가?
//        k: 한 상자에 담으려는 귤의 수
		// t: 귤의 크기
		for (int t : tangerine) {
			if (!map.containsKey(t)) {
				map.put(t, 1);
			} else {
				int count = map.get(t) + 1;
				map.put(t, count);
			}
		}
		// map에 저장된 데이터들을 entySet을 이용해 List에 저장후 정렬
		if (map != null) {
			entryList = new LinkedList<>(map.entrySet());
			entryList.sort(Map.Entry.comparingByValue());
		} else {
			System.out.println("map is null");
			return (Integer) null;
		}
		int cnt = 0;
		int index = entryList.size() - 1;
		while (true) {
			cnt += entryList.get(index).getValue();
			if (cnt >= k) {
				break; //k값보다 같아지거나 더 커지면 거기서 종료(해당 인덱스에 저장된 크기까지 )
			} else {
				index--; //index뒤에서 1씩 감소시켜가며 큰 순서대로 합해주며 k값이랑 비교
				answer++;
			}
		}

		return answer;
	}
}