package LAB7;

public class EmployeeAdd {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("nattha" ,21 ,"Student" , 2000 );

        emp1.displayData();
        emp2.displayData();

        emp1.setName("karn");
        emp1.setAge(21);
        emp1.setPosition("student");
        emp1.setsalary(5002.0);

        emp1.displayData();





    }

}//
