import java.util.Scanner;

public class BOJ15990 {
    static final int limit=100000;
    static final long mod=1000000009L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        long d[][]=new long[limit+1][4];

        for(int i=1;i<=limit;i++){
            for(int j=1;j<=3;j++){
                if(i==j){
                    d[i][i]=1;
                    break;
                }
                if(j==1){
                    d[i][j]=(d[i-j][2]+d[i-j][3])%mod;
                }
                else if(j==2){
                    d[i][j]=(d[i-j][1]+d[i-j][3])%mod;
                }
                else if(j==3){
                    d[i][j]=(d[i-j][1]+d[i-j][2])%mod;
                }
            }
        }

        while(t-->0){
            int n=sc.nextInt();
            long answer=(d[n][1]+d[n][2]+d[n][3]);
            System.out.println(answer%mod);
        }
    }
}
