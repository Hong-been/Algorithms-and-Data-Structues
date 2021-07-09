import java.util.Scanner;

public class BOJ16194 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] p=new int[10001];
        int d[]=new int[n+1];

        for(int i=1;i<=n;i++){
            p[i]=sc.nextInt();
            d[i]=10001;
        }
        System.out.println(operate(n,p,d));
    }
    static int operate(int x, int[] p,int[] d) {
        if (x == 1) {
            return p[1];
        }
        if (d[x] <10001) return d[x];

        for(int i=1;i<=x;i++){
            int tmp=operate(x-i,p,d)+p[i];
            if(d[x]>tmp){
                d[x]=tmp;
            }
        }
        return d[x];
    }
}
