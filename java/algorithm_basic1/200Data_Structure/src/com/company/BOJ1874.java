package com.company;

import java.io.*;
import java.util.*;

public class BOJ1874 {

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int t = sc.nextInt();
        Stack<Integer> st=new Stack<Integer>();
        int num=1;
        String answer="YES";

        while(t-->0) {
            boolean input=false;
            int sequence=sc.nextInt();
            while(input==false && answer.equals("YES")){
                if(st.empty()){
                    if(sequence<num){
                        answer="NO";
                        break;
                    }
                    st.push(num);
                    num+=1;
                    sb.append("+\n");
                    continue;
                }
                if(st.peek()==sequence){
                    st.pop();
                    input=true;
                    sb.append("-\n");
                }
                else{
                    if(st.peek()<sequence){
                        if(sequence<num){
                            answer="NO";
                            break;
                        }
                        st.push(num);
                        num+=1;
                        sb.append("+\n");
                    }
                    else if(st.peek()>sequence){
                        st.pop();
                        sb.append("-\n");
                    }
                }
            }
        }
        if(answer.equals("YES"))
            System.out.println(sb);
        else
            System.out.println(answer);
    }
}

