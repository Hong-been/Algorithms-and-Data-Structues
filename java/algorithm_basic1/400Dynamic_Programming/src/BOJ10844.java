import java.util.Scanner;

public class BOJ10844 {
    static final long mob=1000000000L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long answer=0;
        int [][]d=new int[n+1][10];

        for(int i=1;i<=n;i++){
            for(int j=0;j<=9;j++) {
                if (i == 1) {
                    d[i][j] = 1;
                }
                else if(j==0){
                    d[i][j] = d[i - 1][j + 1];
                }
                else if(j==9){
                    d[i][j] = d[i - 1][j - 1];
                }
                else {
                    d[i][j] = d[i - 1][j - 1] + d[i - 1][j + 1];
                }
                d[i][j]%=mob;
            }
        }
        for(int i=1;i<=9;i++){
            answer+=d[n][i];
        }
        System.out.println(answer%mob);
    }
}
