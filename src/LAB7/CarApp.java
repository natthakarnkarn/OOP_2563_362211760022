package LAB7;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

    public static void main(String[] args) {
        car c1 = new car();

        car c2 = new car("AB123","Black","Honda");

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        c1 = inputDataObject(c1);
        System.out.println(c1.toString());


        ArrayList<car> mycar = new ArrayList<car>();
        mycar.add(c1);
        mycar.add(c2);

        System.out.println(mycar.get(0));

    }

    private static car inputDataObject(car c) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter car id: ");
        String id = sc.nextLine();
        c.setId(id);

        System.out.print("Enter car color: ");
        c.setColor(sc.nextLine());

        System.out.print("Enter car brand: ");
        c.setBrand(sc.nextLine());

        return c;
    }

}