import java.util.Scanner;

public class Empdept extends EmpDetails {
    void emp_dept(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Department name");
        String dept_name = s.next();
        System.out.println("Enter Department id");
        int dept_id = s.nextInt();


        System.out.println("Department Name = "+dept_name);
        System.out.println("Department id ="+dept_id);
        s.close();

    }


     public static void main(String args[]){

        Empdept e1 = new Empdept();
        e1.Empdetails();
        e1.emp_dept();

    }
}
