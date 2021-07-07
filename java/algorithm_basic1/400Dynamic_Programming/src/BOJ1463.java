import java.util.Scanner;

public class BOJ1463 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[] D=new int[1000001];
        System.out.println(operate(x, D));
    }

    static int operate(int x, int[] D){
        if(x==1) return 0;
        if(D[x]>0) return D[x];

        D[x]=operate(x-1,D)+1;

        if(x%2==0){
            int tmp=operate(x/2,D)+1;
            if(D[x]>tmp){
                D[x]=tmp;
            }
        }
        if(x%3 ==0){
            int tmp=operate(x/3,D)+1;
            if(D[x]>tmp){
                D[x]=tmp;
            }
        }
        return D[x];
    }
}