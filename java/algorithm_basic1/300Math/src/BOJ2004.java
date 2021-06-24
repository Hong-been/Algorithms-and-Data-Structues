import java.util.Scanner;
public class BOJ2004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n=sc.nextLong();
        long m=sc.nextLong();
        long primeTwo=0;
        long primeFive=0;

        if(m==0 || m==n){
            System.out.println("1");
            return;
        }
        if(m==1){
            System.out.println(n);
            return;
        }
        primeTwo+= (NumbersPrime(n,2)- NumbersPrime(n-m,2)- NumbersPrime(m,2));
        primeFive+= (NumbersPrime(n,5)- NumbersPrime(n-m,5)- NumbersPrime(m,5));

        System.out.println(Math.min(primeTwo,primeFive));
    }
    public static long NumbersPrime(long x, int prime){
        long sum=0;
        for(long i=prime;i<=x;i*=prime){
            sum+=x/i;
        }
        return sum;
    }
}
