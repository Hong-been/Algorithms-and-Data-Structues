package Second;
import java.util.Arrays;
import java.util.Scanner;
public class BOJ15656 {
    static int[] a= new int[10];
    static boolean[] c=new boolean[10];
    static StringBuilder sb=new StringBuilder();
    static int[] nums;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=sc.nextInt();
        nums=new int[n];

        for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();
        Arrays.sort(nums);
        go(0,n,m);

        System.out.println(sb.toString());
    }
    static void go(int index, int n, int m){
        if(index==m){
            for(int i=0;i<m;i++){
                sb.append(a[i]+" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=0;i<n;i++){

            a[index]=nums[i];
            go(index+1,n,m);
        }

    }

}

