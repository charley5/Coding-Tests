package main.hackerrank_java;

import java.util.*;

public class javaStdinAndStdout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myFirstInt = scanner.nextInt();
        int mySecondInt = scanner.nextInt();
        int myThirdInt = scanner.nextInt();
        scanner.close();

        System.out.println(myFirstInt);
        System.out.println(mySecondInt);
        System.out.println(myThirdInt);
    }
}
