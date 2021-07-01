import java.util.Scanner;

public class BOJ1317 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bi=sc.nextLine();
        int n=bi.length();

        if(n%3==1){
            System.out.print(bi.charAt(0));
        }
        else if(n%3==2){
            System.out.print((bi.charAt(0)-'0')*2 + (bi.charAt(1)-'0'));
        }
        for(int i=n%3;i<n;i+=3){
            System.out.print((bi.charAt(i)-'0')*4 + (bi.charAt(i+1)-'0')*2 +(bi.charAt(i+2)-'0'));
        }
        System.out.println();
    }
}
