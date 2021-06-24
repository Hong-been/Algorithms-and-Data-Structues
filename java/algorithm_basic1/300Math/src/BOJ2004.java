import java.util.Scanner;
public class BOJ2004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m=sc.nextInt();
        int n=sc.nextInt();
        int answer;

        int primeTwo=0;
        int primeFive=0;

        primeTwo+= (NumbersPrime(m,2)- NumbersPrime(m-n,2)- NumbersPrime(n,2));
        primeFive+= (NumbersPrime(m,5)- NumbersPrime(m-n,5)- NumbersPrime(n,5));

        if(primeTwo<primeFive){
            answer=primeTwo;
        }
        else{
            answer=primeFive;
        }

        System.out.println(answer);

    }
    public static int NumbersPrime(int x, int prime){
        int sum=0;
        for(int i=prime;i<=x;i+=prime){
            int a=i;
            sum++;
            a/=prime;
            while(a%prime==0){
                a/=prime;
                sum++;
            }
        }
        return sum;
    }

}
