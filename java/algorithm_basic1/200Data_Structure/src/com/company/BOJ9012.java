package com.company;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class BOJ9012 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int t = sc.nextInt();
        Stack<Character> st=new Stack<Character>();

        for(;t>0;t--) {
            String answer = null;
            st.clear();
            String ps = sc.next();

            for(int i=0;i<ps.length();i++){
                if(ps.charAt(i)=='('){
                    st.push('(');
                }
                else if(ps.charAt(i)==')'){
                    try{
                        st.pop();
                    }
                    catch(EmptyStackException e){
                        answer = "NO";
                    }
                }
            }
            if(answer!=null){
                bw.write(answer+"\n");
                continue;
            }
            if(st.empty())
                answer="YES";
            else
                answer="NO";

            bw.write(answer + "\n");
        }
        bw.flush();
    }
}


