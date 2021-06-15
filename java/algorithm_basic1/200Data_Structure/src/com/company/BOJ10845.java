package com.company;

import java.io.*;
import java.util.*;

public class BOJ10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();

        int t=Integer.parseInt(br.readLine());
        int last=0;
        while(t-->0){
            String[] order=br.readLine().split(" ");
            String cmd=order[0];
            if(cmd.equals("push")){
                int num=Integer.parseInt(order[1]);
                last=num;
                queue.add(num);
            }
            else if(cmd.equals("pop")){
                if(queue.isEmpty())
                    System.out.println("-1");
                else
                    System.out.println(queue.remove());
            }
            else if(cmd.equals("size")){
                System.out.println(queue.size());
            }
            else if(cmd.equals("empty")){
                if(queue.isEmpty())
                    System.out.println("1");
                else
                    System.out.println("0");
            }
            else if(cmd.equals("front")){
                if(queue.isEmpty())
                    System.out.println("-1");
                else
                    System.out.println(queue.peek());
            }
            else if(cmd.equals("back")){
                if(queue.isEmpty())
                    System.out.println("-1");
                else
                    System.out.println(last);
            }

        }

    }

}

