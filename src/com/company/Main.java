package com.company;

import java.util.Scanner;

public class Main {
    public static int pentagon(int x){
        int pentagon;
        pentagon = x*(3*x-1)/2;
        return pentagon;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.print("nhap vao mot so bat ki:");
        x = scanner.nextInt();
        System.out.print("Gia tri pentagon tra ve:"+pentagon(x));
    }
}
