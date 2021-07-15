package Second;
import java.util.Scanner;
public class BOJ15651 {
    static int[] a= new int[10];
    static StringBuilder sb=new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=sc.nextInt();
        go(0,n,m);
        System.out.println(sb.toString());
    }

    static void go(int index, int n, int m){
        if(index==m){
            for(int i=0;i<m;i++){
                sb.append(a[i]);
                if(i!=m-1) sb.append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=1;i<=n;i++){
            a[index]=i;
            go(index+1,n,m);

        }
    }
}

