import java.util.Scanner;
import java.util.Stack;

public class BOJ14002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n + 1];
        int d[] = new int[n + 1];
        int v[]=new int[n+1];
        Stack<Integer> st=new Stack<>();
        int ans=d[1];

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            d[i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = i - 1; j >= 1; j--) {
                if (a[i] > a[j] && d[i] < d[j] + 1) {
                    d[i] = d[j] + 1;
                    v[i]=j;
                }
            }
        }
        int ansIndex=1;
        for(int i=1;i<=n;i++) {
            if (ans < d[i]) {
                ans = d[i];
                ansIndex = i;
            }
        }
        System.out.println(ans);
        while(ansIndex>0){
            st.push(a[ansIndex]);
            ansIndex=v[ansIndex];
        }
        while(!st.empty())
            System.out.print(st.pop()+" ");

    }
}
