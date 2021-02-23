package LAB8;

public class CompanyApp {

    public static void main(String[] args) {

        Employee emp1 = new Employee();

        emp1.setPid("180991102541");
        emp1.setName("Puriwat Lertkrai");
        emp1.setAge(34);
        emp1.setGender("Male");
        emp1.setTel("083539xxxx");

        emp1.setEmpID("emp001");
        emp1.setPosition("Programmer");
        emp1.setSalary(30000.00);

        //display object data
        System.out.println(emp1.toString());



    }//main
}//class