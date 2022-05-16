import java.util.Scanner;

public class j53{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer = 1;
        for (; b > 0; b--) {
            answer *= a;
        }
        System.out.print(answer);
    }
}