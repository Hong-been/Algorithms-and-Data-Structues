import java.util.Scanner;

public class BOJ2193 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long [][]d=new long[n+1][3];

        for(int i=1;i<=n;i++){
            for(int j=0;j<=1;j++) {
                if (i == 1) {
                    d[1][1] = 1;
                }
                else if(j==0){
                    d[i][j] = d[i - 1][1]+d[i-1][0];
                }
                else {
                    d[i][j] = d[i - 1][0];
                }
            }
        }
        System.out.println(d[n][0]+d[n][1]);
    }
}
