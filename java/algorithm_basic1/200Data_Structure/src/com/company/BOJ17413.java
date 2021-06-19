package com.company;

import java.io.*;
import java.util.*;

public class BOJ17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> st=new Stack<>();

        String input=br.readLine()+' ';
        int len=input.length();
        for(int i=0;i<len;i++){
            if(input.charAt(i)=='<'){
                while(!st.empty()){
                    bw.write(st.pop());
                }
                while(input.charAt(i)!='>'){
                    bw.write(input.charAt(i));
                    i++;
                }
                bw.write(input.charAt(i));
            }
            else if(input.charAt(i)==' '){
                while(!st.empty()){
                    bw.write(st.pop());
                }
                bw.write(input.charAt(i));
            }
            else{
                st.push(input.charAt(i));
            }
        }
        bw.flush();
    }
}


