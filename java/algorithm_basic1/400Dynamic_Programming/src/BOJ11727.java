import java.util.Scanner;

public class BOJ11727 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[] d=new int[x+1];
        System.out.println(operate(x, d));
    }

    static int operate(int x, int[] d){
        if(x==1) return 1;
        if(x==2) return 3;
        if(d[x]>0) return d[x];

        d[x]=operate(x-1,d)+operate(x-2,d)*2;
        d[x]%=10007;
        return d[x];
    }
}
