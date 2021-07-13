import java.util.Scanner;
public class BOJ1107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] broken=new boolean[10];
        for(int i=0;i<m;i++){
            broken[sc.nextInt()]=true;
        }
        int cnt=Math.abs(n-100);

        for(int i=0;i<=1000000;i++){
            int c=i;
            int len=0;
            if(c==0) len+=1;
            while(c>0){
                len+=1;
                c/=10;
            }
            if(n==100)
                break;
            if(!isBroken(i,broken)){
                int tmp=len+Math.abs(i-n);
                if(tmp<cnt) cnt=tmp;
            }
        }
        System.out.println(cnt);
    }
    static boolean isBroken(int c, boolean[] broken){
        if(c==0 && broken[0])
            return true;
        while(c>0){
            if(broken[c%10])
                return true;
            c/=10;
        }
        return false;
    }
}

