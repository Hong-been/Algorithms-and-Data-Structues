package com.company;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;
public class BOJ9093 {

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(sc.nextLine());
        Stack<Character> st=new Stack<Character>();

        for(;t>0;t--) {
            String Sentence = sc.nextLine()+"\n";
            for (int i = 0; i < Sentence.length(); i++) {
                char c = Sentence.charAt(i);
                if (c == ' '||c=='\n') {
                    while (st.empty() == false) {
                        bw.write(st.pop());
                    }
                    if(c=='\n'&&t>1)
                        bw.write("\n");
                    else if(i<Sentence.length()-1)
                        bw.write(" ");
                    continue;
                }
                st.push(c);
            }
        }
        bw.flush();
    }
}
