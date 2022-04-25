package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, give hour: ");
        int h = sc.nextInt();
        System.out.println("Please, give minute: ");
        int m = sc.nextInt();
        System.out.println("Please, give second: ");
        int s = sc.nextInt();

        int seconds = (h * 3600) + (m * 60) + s;

        System.out.println(seconds + "seconds");
    }
}

