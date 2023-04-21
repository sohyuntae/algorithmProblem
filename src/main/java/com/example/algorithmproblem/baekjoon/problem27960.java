package com.example.algorithmproblem.baekjoon;

public class problem27960 {

    /* 27960 문제
    *  xor 연산 이용
    * */
    public static void main(String[] args) {

        String x = "55 73";

        int a = Integer.parseInt(x.split(" ")[0]);
        int b = Integer.parseInt(x.split(" ")[1]);

        System.out.println(a ^ b);
    }
}
