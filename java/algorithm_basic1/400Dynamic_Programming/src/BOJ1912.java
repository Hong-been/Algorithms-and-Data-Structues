import java.util.Scanner;

public class BOJ1912 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n + 1];
        int d[] = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            d[i] = a[i];
        }

        for (int i = 2; i <= n; i++) {
            if(d[i]<d[i-1]+a[i])
                d[i]=d[i-1]+a[i];
        }

        int ans=d[1];
        for(int i=1;i<=n;i++) {
            if (ans < d[i]) {
                ans = d[i];
            }
        }
        System.out.println(ans);

    }
}
