
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int count = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());

        List<Integer> cards = new ArrayList<>();

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < count; i++) {
            cards.add(Integer.parseInt(st.nextToken()));
        }

        int result = search(cards, count, num);
        System.out.println(result);
    }


    // 탐색
    static int search(List<Integer> cards, int count, int num) {
        int result = 0;

        // 3개를 고르기 때문에 첫번째 카드는 N - 2 까지만 순회
        for (int i = 0; i < count - 2; i++) {

            // 첫 번째 카드가 M 보다 크면 skip
            if(cards.get(i) > num) continue;

            for (int j = i + 1; j < count - 1; j++) {

                if(cards.get(i) + cards.get(j) > num) continue;

                for (int k = j + 1; k < count; k++) {

                    int temp = cards.get(i)+cards.get(j)+cards.get(k);

                    if (num == temp) {
                        return temp;
                    }

                    if(result < temp && temp < num) {
                        result = temp;
                    }
                }
            }
        }

        return result;
    }
}