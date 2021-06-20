package com.company;
import java.io.*;
import java.util.*;
public class BOJ17299 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> st=new Stack<>();
        int t=sc.nextInt();
        int[] nums=new int[t];
        int[] NGF=new int[t];
        int[] freq=new int[t+1];

        Arrays.fill(NGF, -1);
        Arrays.fill(freq, 0);

        for(int i=0;i<t;i++){
            nums[i]=sc.nextInt();
            freq[nums[i]]+=1;
        }

        for(int i=1;i<t+1;i++){
            int numFreq=freq[nums[i-1]];

            if(st.empty()){
                st.push(i-1);
            }
            else{
                while(freq[nums[st.peek()]]<numFreq){
                    NGF[st.pop()]=nums[i-1];
                    if(st.empty())
                        break;
                }
                st.push(i-1);
            }
        }

        for(int i=0;i<t;i++){
            bw.write(NGF[i]+" ");
        }
        bw.flush();
    }
}

