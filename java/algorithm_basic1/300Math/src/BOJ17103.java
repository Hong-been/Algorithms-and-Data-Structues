import java.util.Scanner;
public class BOJ17103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        boolean[] check=new boolean[1000001];
        check[1]=true;

        for(int i=2;i<=1000000;i++){
            if(check[i]==false){
                for(int j=i*2;j<=1000000;j+=i){
                    check[j]=true;
                }
            }
        }

        while(t-->0){
            int num=sc.nextInt();
            int cnt=0;

            for(int i=2;i<=num/2;i++){
                if(check[i]==false && check[num-i]==false){
                    cnt++;
                }
            }

            System.out.println(cnt);
        }
    }
}
