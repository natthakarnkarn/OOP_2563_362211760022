package HomeWork;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (count<3) {
            System.out.print("Username : ");
            String Username = scanner.nextLine();

            System.out.print("Password : ");
            String Password = scanner.nextLine();
            if (Username.equals("admin") && Password.equals("saiyai"))
            {
                System.out.println("Welcome to MT website");
                break;
            }
            else {
                System.out.println("Username or password not correct. ");
                count++;
            }
            if (count==3)
            {
                System.out.println("Your account has been locked. Please, contact admin.");
            }


        }//

    }//
}//


