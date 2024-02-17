import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str_N = sc.nextLine();

        int len = str_N.length();

        int num = Integer.parseInt(str_N);
        int result = 0;

        for(int i = (num - (len * 9)); i < num; i++) {
            int number = i;
            int sum = 0;

            while(number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if(sum + i == num) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }

}