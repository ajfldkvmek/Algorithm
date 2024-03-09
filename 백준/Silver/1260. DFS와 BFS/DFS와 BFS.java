import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static boolean[] check;
    static int[][] arr;

    static int vertex, edge, start;

    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        vertex = Integer.parseInt(st.nextToken());
        edge = Integer.parseInt(st.nextToken());
        start= Integer.parseInt(st.nextToken());

        arr = new int[vertex][vertex];
        check = new boolean[vertex];

        for(int i = 0 ; i < edge ; i ++) {
            StringTokenizer str = new StringTokenizer(br.readLine());

            int src = Integer.parseInt(str.nextToken()) - 1;
            int dest = Integer.parseInt(str.nextToken()) - 1;

            arr[src][dest] = 1;
            arr[dest][src] = 1;
        }
        //sb.append("\n");
        dfs(start-1);
        sb.append("\n");
        check = new boolean[vertex];

        bfs(start-1);

        System.out.println(sb);

    }
    public static void dfs(int start) {

        check[start] = true;
        sb.append( (start+1) + " ");

        for(int i = 0 ; i < vertex ; i++) {
            if(arr[start][i] == 1 && !check[i])
                dfs(i);
        }

    }

    public static void bfs(int start) {
        queue.add(start);
        check[start] = true;

        while(!queue.isEmpty()) {

            start = queue.poll();
            sb.append( (start+1) + " ");

            for(int i = 0 ; i < vertex ; i++) {
                if(arr[start][i] == 1 && !check[i]) {
                    queue.add(i);
                    check[i] = true;
                }
            }
        }


    }

}