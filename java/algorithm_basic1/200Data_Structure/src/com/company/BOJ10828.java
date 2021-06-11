package com.company;

import java.io.*;
import java.util.*;

public class BOJ10828 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = sc.nextInt();
        Stack<Integer> st= new Stack<>();
        int size=0;

        while(t-->0){
            String order=sc.next();
            if(order.equals("push")){
                int x=sc.nextInt();
                st.push(x);
                size++;
            }
            else if(order.equals("pop")){
                if(size==0){
                    bw.write("-1\n");
                }
                else{
                    bw.write(st.pop()+"\n");
                    size--;
                }
            }
            else if(order.equals("size"))
                bw.write(size+"\n");

            else if(order.equals("empty")){
                if(size==0)
                    bw.write("1\n");
                else
                    bw.write("0\n");
            }
            else if(order.equals("top")){
                if(size==0){
                    bw.write("-1\n");
                }
                else{
                    bw.write(st.peek()+"\n");
                }
            }

        }
        bw.flush();
    }
}

