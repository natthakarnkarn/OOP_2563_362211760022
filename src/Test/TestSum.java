package Test;

import java.util.Scanner;

public class TestSum {
    public static void main(String[] args) {
        int sum,n;
        sum = 0;
        Scanner num = new Scanner(System.in);

        System.out.println("Enter Final Number : ");
        n = num.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(sum);
            sum = sum + i;
        }
    }

}
