import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        //a b c d e f 순으로 들어올 예정
        //ax + by = c
        //dx + ey = f

        //x, y는 미지수
        int x = 0, y = 0;
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        boolean flag = false;

        for(int i = -999; i <= 999; i++){
            for(int j = -999; j <= 999; j++){
                boolean b1 = (a*i + b*j == c);
                boolean b2 = (d*i + e*j == f);
                if(b1 && b2) {
                    x = i;
                    y = j;
                    flag = true;
                    break;
                }
            }
            if(flag) break;
        }

        System.out.println(x + " " + y);
    }

}