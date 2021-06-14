package com.company;

import java.io.*;
import java.util.*;

public class BOJ1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> left=new Stack<>();
        Stack<Character> right=new Stack<>();

        String input = br.readLine();
        for(int i=0;i<input.length();i++){
            left.push(input.charAt(i));
        }
        int m = Integer.parseInt(br.readLine());

        while(m-->0){
            String[] order=br.readLine().split(" ");
            char what=order[0].charAt(0);

            if(what=='L' && !left.empty()){
                right.push(left.pop());
            }
            else if(what=='D' && !right.empty()){
                left.push(right.pop());
            }
            else if(what=='B' && !left.empty()){
                left.pop();
            }
            else if(what=='P'){
                left.push(order[1].charAt(0));
            }
        }
        while(!left.empty())
            right.push(left.pop());
        while(!right.empty())
            sb.append(right.pop());

        System.out.println(sb);
    }

}
