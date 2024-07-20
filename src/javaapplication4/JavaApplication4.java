
package javaapplication4;

import javaapplication4.service.serviceImplement.StudentServiceImplementation;
import javaapplication4.util.SmsDisplay;
import javaapplication4.service.StudentService;
import java.util.Scanner;
import static javaapplication4.util.SmsDisplay.dashboard;


public class JavaApplication4 {

  
    public static void main(String[] args) {
        StudentService service =new StudentServiceImplementation();
        Scanner s = new Scanner(System.in);
        SmsDisplay.dashboard();
        System.out.println(" Enter your choice");
      int var1 = s.nextInt();
      
      switch (var1) {
         case 1:
             service.saveStudent();
             break;
         case 2:
            service.updateStudent();
            break;
         case 3:
            service.viewAllStudents();
            break;
         case 4:
            service.searchStudent();
            break;
         case 5:
            service.removeStudent();
            break;
         case 6:
            System.exit(0);
            break;
         default:
            System.out.println("\u001b[H\u001b[2J");
            System.out.println("Invalid choice try again.....!!!");
            dashboard();
      }
    }
    
}
