package com.company;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();

        while(T-->0){
            String s=sc.next();
            String num[] = s.split(",");
            int a = parseInt(num[0]);
            int b = parseInt(num[1]);
            System.out.println(a+b);
    }}
}
