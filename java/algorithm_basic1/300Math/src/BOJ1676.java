import java.util.Scanner;
public class BOJ1676 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        for (int i = 5; i <= n; i += 5) {
            int a=i;
            sum++;
            a/=5;
            while(a%5==0){
                a/=5;
                sum++;
            }
        }
        System.out.println(sum);
    }
}

