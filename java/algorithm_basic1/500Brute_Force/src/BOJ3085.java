import java.util.Scanner;
public class BOJ3085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max=1;
        char[][] a = new char[n][n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.next().toCharArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n - 1 && j == n - 1);
                else if (i == n - 1) {
                    if (a[i][j] != a[i][j + 1]) {
                        swap(a,i,j,i,j+1);
                        int tmp=findMax(a, n);
                        if(tmp>max) max=tmp;
                        swap(a,i,j,i,j+1);
                    }
                }
                else if (j == n - 1) {
                    if (a[i][j] != a[i + 1][j]) {
                        swap(a,i,j,i+1,j);
                        int tmp=findMax(a, n);
                        if(tmp>max) max=tmp;
                        swap(a,i,j,i+1,j);
                    }
                }
                else {
                    if (a[i][j] != a[i][j + 1]) {
                        swap(a,i,j,i,j+1);
                        int tmp=findMax(a, n);
                        if(tmp>max) max=tmp;
                        swap(a,i,j,i,j+1);
                    }
                    if (a[i][j] != a[i+1][j]) {
                        swap(a,i,j,i+1,j);
                        int tmp=findMax(a, n);
                        if(tmp>max) max=tmp;
                        swap(a,i,j,i+1,j);
                    }
                }
            }
        }
        System.out.println(max);
    }
    static void swap(char [][]a, int i, int j,int x,int y){
        char tmp = a[i][j];
        a[i][j] = a[x][y];
        a[x][y] = tmp;
    }
    static int findMax(char[][] a, int n) {
        int length=1;
        for(int i=0;i<n;i++){
            int tmp=1;
            for(int j=0;j<n-1;j++){
                if(a[i][j]==a[i][j+1]) tmp+=1;
                else tmp=1;
                if(tmp>length) length=tmp;
            }
            tmp=1;
            for(int j=0;j<n-1;j++){
                if(a[j][i]==a[j+1][i]) tmp+=1;
                else tmp=1;
                if(tmp>length) length=tmp;
            }
        }
        return length;
    }
}
