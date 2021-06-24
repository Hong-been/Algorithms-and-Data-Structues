import java.util.Scanner;
public class BOJ10872 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int fact=1;
        while(n>1){
            fact*=n--;
        }
        System.out.println(fact);
    }
}
