package com.company;

import java.io.*;
import java.util.*;

public class BOJ1874 {

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int t = sc.nextInt();
        Stack<Integer> st=new Stack<Integer>();
        int save=0;

        while(t-->0) {
            int inputSeq=sc.nextInt();

            if(inputSeq>save){
                for(int i=save+1;i<=inputSeq;i++){
                    st.push(i);
                    sb.append("+\n");
                }
                save=inputSeq;
            }

            if(inputSeq==st.peek()){
                st.pop();
                sb.append("-\n");
            }
            else if(inputSeq!=st.peek()){
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);
    }
}

