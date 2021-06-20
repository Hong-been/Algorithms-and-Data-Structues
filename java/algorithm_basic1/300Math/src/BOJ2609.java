package com.company;
import java.util.Scanner;

public class BOJ2609 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.println(GCD(x,y));
        System.out.println(LCM(x,y));
    }
    public static int GCD(int a, int b){
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
    public static int LCM(int a, int b){
        int GCD=GCD(a,b);
        return a*b/GCD;
    }
}
