import java.util.Scanner;
public class BOJ14500 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][]= new int[n][m];
        int cnt=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j+3<m){
                    //1
                    int tmp=a[i][j]+a[i][j+1]+a[i][j+2]+a[i][j+3];
                    if(tmp>cnt) cnt=tmp;
                }
                if(i+3<n){
                    //2
                    int tmp=a[i][j]+a[i+1][j]+a[i+2][j]+a[i+3][j];
                    if(tmp>cnt) cnt=tmp;
                }
                if(j+1<m && i+1<n){
                    //3
                    int tmp=a[i][j]+a[i][j+1]+a[i+1][j]+a[i+1][j+1];
                    if(tmp>cnt) cnt=tmp;
                }
                if(j+2<m && i+1<n){
                    int tmp;
                    //6
                    tmp=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1];
                    if(tmp>cnt) cnt=tmp;
                    //7
                    tmp=a[i+1][j]+a[i+1][j+1]+a[i+1][j+2]+a[i][j+1];
                    if(tmp>cnt) cnt=tmp;
                    //12
                    tmp=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j];
                    if(tmp>cnt) cnt=tmp;
                    //13
                    tmp=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+2];
                    if(tmp>cnt) cnt=tmp;
                    //16
                    tmp=a[i][j]+a[i+1][j]+a[i+1][j+1]+a[i+1][j+2];
                    if(tmp>cnt) cnt=tmp;
                    //17
                    tmp=a[i][j+2]+a[i+1][j]+a[i+1][j+1]+a[i+1][j+2];
                    if(tmp>cnt) cnt=tmp;
                    //18
                    tmp=a[i][j+1]+a[i][j+2]+a[i+1][j]+a[i+1][j+1];
                    if(tmp>cnt) cnt=tmp;
                    //19
                    tmp=a[i][j]+a[i][j+1]+a[i+1][j+1]+a[i+1][j+2];
                    if(tmp>cnt) cnt=tmp;
                }
                if(j+1<m && i+2<n){
                    int tmp;
                    //4
                    tmp=a[i][j]+a[i+1][j]+a[i+1][j+1]+a[i+2][j+1];
                    if(tmp>cnt) cnt=tmp;
                    //5
                    tmp=a[i][j+1]+a[i+1][j+1]+a[i+1][j]+a[i+2][j];
                    if(tmp>cnt) cnt=tmp;
                    //8
                    tmp=a[i][j]+a[i+1][j]+a[i+2][j]+a[i+1][j+1];
                    if(tmp>cnt) cnt=tmp;
                    //9
                    tmp=a[i][j+1]+a[i+1][j+1]+a[i+2][j+1]+a[i+1][j];
                    if(tmp>cnt) cnt=tmp;
                    //10
                    tmp=a[i][j]+a[i+1][j]+a[i+2][j]+a[i+2][j+1];
                    if(tmp>cnt) cnt=tmp;
                    //11
                    tmp=a[i][j+1]+a[i+1][j+1]+a[i+2][j+1]+a[i+2][j];
                    if(tmp>cnt) cnt=tmp;
                    //14
                    tmp=a[i][j]+a[i][j+1]+a[i+1][j+1]+a[i+2][j+1];
                    if(tmp>cnt) cnt=tmp;
                    //15
                    tmp=a[i][j]+a[i+1][j]+a[i+2][j]+a[i][j+1];
                    if(tmp>cnt) cnt=tmp;
                }
            }
        }
        System.out.println(cnt);
    }
}

