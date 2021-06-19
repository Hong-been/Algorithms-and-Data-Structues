package com.company;
import java.io.*;
import java.util.*;

public class BOJ17298 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> st=new Stack<>();
        int t=sc.nextInt();
        int[] nums=new int[t];
        int[] NGE=new int[t];
        Arrays.fill(NGE, -1);

        for(int i=0;i<t;i++){
            nums[i]=sc.nextInt();
        }

        for(int i=0;i<t;i++){
            int num=nums[i];
            if(st.empty()){
                st.push(i);
            }
            else{
                while(nums[st.peek()]<num){
                    NGE[st.pop()]=num;
                    if(st.empty())
                        break;
                }
                st.push(i);
            }
        }

        for(int i=0;i<t;i++){
            bw.write(NGE[i]+" ");
        }
        bw.flush();
    }

}

