import java.util.Scanner;
public class BOJ1929 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        boolean[] isChecked = new boolean[1000001];
        isChecked[1]=true;

        for(int i=2;i<=n;i++){
            if(isChecked[i]==false){
                for(int j=i*2;j<=n;j+=i){
                    isChecked[j]=true;
                }
            }
        }

        for(int i=m;i<=n;i++){
            if(!isChecked[i]){
                System.out.println(i);
            }
        }
    }
}
