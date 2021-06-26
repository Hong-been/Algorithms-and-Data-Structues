import java.util.Scanner;
public class BOJ10787 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        int s=sc.nextInt();

        int gcd=Math.abs(s-sc.nextInt());

        while(--t>0){
            int gap=Math.abs(s-sc.nextInt());
            gcd=GCD(gap,gcd);
        }
        System.out.println(gcd);
    }
    static int GCD(int a, int b){
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
}
