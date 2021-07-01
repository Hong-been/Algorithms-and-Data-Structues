import java.util.Scanner;
import java.util.Stack;

public class BOJ2089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        Stack<Integer> st=new Stack<>();
        if(num==0){
            System.out.println("0");
            return;
        }

        while(num!=0) {
            int r = num % -2;
            if (r == -1) {
                num =(num/-2)+ 1;
                r = 1;
                st.push(r);
            }
            else{
                st.push(r);
                num /= -2;
            }
        }

        while(!st.empty()){
            System.out.print(st.pop());
        }
        System.out.println();
    }
}

