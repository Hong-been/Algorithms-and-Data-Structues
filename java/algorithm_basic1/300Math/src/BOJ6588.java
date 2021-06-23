import java.util.Scanner;
public class BOJ6588 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] primeFalse=new boolean[1000001];
        primeFalse[1]=true;

        for(int i=2;i<=1000000;i++){
            if(primeFalse[i]==false){
                for(int j=i*2;j<=1000000;j+=i){
                    primeFalse[j]=true;
                }
            }
        }

        while(true){
            int n=sc.nextInt();
            if(n==0){
                break;
            }
            int i;
            for(i=2;i<n;i++){
                if(primeFalse[i]==false && primeFalse[n-i]==false){
                    System.out.println(n+" = "+i+" + "+(n-i));
                    break;
                }
            }
            if(i==n)
                System.out.println("Goldbach's conjecture is wrong.");
        }
    }
}

