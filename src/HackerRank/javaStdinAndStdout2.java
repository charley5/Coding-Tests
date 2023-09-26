package HackerRank;
import java.io.*;
import java.util.*;

public class javaStdinAndStdout2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int userInt = scanner.nextInt();
        double userDouble = scanner.nextDouble();
        scanner.nextLine();
        String userString = scanner.nextLine();

        System.out.println("String: " + userString);
        System.out.println("Double: " + userDouble);
        System.out.println("Int: " + userInt);
    }
}
