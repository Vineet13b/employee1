
import java.util.Scanner;
public class EmpDetails {    
 void Empdetails(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Employee name");
        String name = s.next();
        System.out.println("Enter employee date of joining");
        String dateJoining = s.next();
        System.out.println("Enter employee Employee id");
        int empid = s.nextInt();
        System.out.println("Name = "+name);
        System.out.println("Date of joining = "+dateJoining);
        System.out.println("Employee id ="+empid);
        s.close();


        

       
        
        
    }


}
