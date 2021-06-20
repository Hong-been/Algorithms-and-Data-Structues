import java.util.Scanner;

public class BOJ1978 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t=sc.nextInt();
        int cnt=0;

        while(t-->0) {
            int x = sc.nextInt();
            if(primeNumber(x)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static boolean primeNumber(int x){
        if(x<2){
            return false;
        }
        for(int i=2;i*i<=x;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
}
