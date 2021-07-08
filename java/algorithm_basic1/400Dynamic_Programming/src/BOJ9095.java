import java.util.Scanner;

public class BOJ9095 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] d = new int[n + 1];
            System.out.println(operate(n, d));
        }
    }

    static int operate(int x, int[] d) {
        if (x == 1) return 1;
        if (x == 2) return 2;
        if (x == 3) return 4;
        if (d[x] > 0) return d[x];

        for (int i = 1; i <= 3; i++) {
            d[x]+=operate(x-i,d);
        }
        return d[x];
    }
}
