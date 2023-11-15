package main.hackerrank_java;

import java.io.*;

import static java.util.stream.Collectors.joining;

public class javaIfElse {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if ((N % 2 == 1 ) || (N >= 6 ) && (N <= 20)) {
            System.out.println("Weird");
        }
        else if ((N >= 2 && N <=5) || N >= 20) {
            System.out.println("Not Weird");
        }
        else {
            System.out.println("Error");
        }

        bufferedReader.close();
    }
}
