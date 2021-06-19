package com.company;
import java.io.*;
import java.util.*;

public class BOJ10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> st=new Stack<>();
        int cnt=0;

        String input=br.readLine();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='(' && input.charAt(i+1)==')'){
                cnt+=st.size();
                i++;
            }
            else if(input.charAt(i)=='('){
                st.push('(');
            }
            else if(input.charAt(i)==')'){
                cnt+=1;
                st.pop();
            }
        }
        System.out.print(cnt);


    }

}

