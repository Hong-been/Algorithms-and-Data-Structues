package com.company;

import java.io.*;
import java.util.*;

public class BOJ1406 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();

        String input = sc.next();
        for(int i=0;i<input.length();i++){
            st1.push(input.charAt(i));
        }
        int m = sc.nextInt();

        while(m-->0){
            String order=sc.next();
            if(order.equals("L")){
                if(st1.empty())
                    continue;
                st2.push(st1.pop());
            }
            else if(order.equals("D")){
                if(st2.empty())
                    continue;
                st1.push(st2.pop());
            }
            else if(order.equals("B")){
                if(st1.empty())
                    continue;
                st1.pop();
            }
            else if(order.equals("P")){
                st1.push(sc.next().charAt(0));
            }
        }
        while(!st1.empty())
            st2.push(st1.pop());

        while(!st2.empty())
            System.out.print(st2.pop());
    }
}
