import java.util.Scanner;
public class BOJ9613 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            long gcd=0;
            int n=sc.nextInt();
            int[] nums=new int[n];

            for(int i=0;i<n;i++){
                nums[i]=sc.nextInt();
                for(int j=i-1;j>=0;j--){
                    gcd+=GCD(nums[i],nums[j]);
                }
            }
            System.out.println(gcd);
        }
    }
    static int GCD(int a,int b){
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
}

