package LAB3;

import java.util.Scanner;

public class ex_for2 {

    public static void main(String[] args) {
        //รับค่าจำนวนเต็ม 5 จำนวน
        //หาผลรวม
        //หาค่าเฉลี่ยจากข้อมูล คือ ผลรวมข้อมูล หาร/ จำนวนข้อมูล
        Scanner sc = new Scanner(System.in);
        int total = 0;

        for (int i = 0; i <5 ; i++) { //0-4
            System.out.print("Enter integers");
            int num = sc.nextInt();
            total += num;
            //System.out.println("entered : "+ num);

        }
            System.out.println("Total: "+total);
            System.out.println("Average: "+(total/5));
            System.out.println("Good bye");


    }//
}//
