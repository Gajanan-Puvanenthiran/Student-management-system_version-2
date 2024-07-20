
package javaapplication4.service.serviceImplement;

import Repo.RepoImplement.StudentRepoImplement;
import Repo.StudentRepo;
import javaapplication4.service.StudentService;


import java.util.Scanner;
import javaapplication4.object.Student;


public class StudentServiceImplementation implements StudentService {
    Scanner s = new Scanner(System.in);
    StudentRepo repo=new StudentRepoImplement();
    @Override
    public void saveStudent() {
        
      System.out.println("\u001b[H\u001b[2J");
      System.out.println("--------------------------------------------------------");
      System.out.println("|-Welcome to Developer Stack Student Management System-|");
      System.out.println("--------------------------------------------------------");
      System.out.println("----------------");
      System.out.println("|-Save Student-|");
      System.out.println("----------------\n");
      
      System.out.print("Enter Student Name : ");
        String name=s.nextLine();        

        System.out.print("Enter Student Age : ");
        int age=s.nextInt();
        s.nextLine();

        System.out.print("Enter Student Department : ");
        String department=s.nextLine();

        System.out.print("Enter Student District : ");
        String district=s.nextLine();

        System.out.print("Enter Student NIC : ");
        String NIC =s.nextLine();

        System.out.print("Enter Student Gender : ");
        String gender=s.nextLine();

        System.out.print("Enter Student Performance : ");
        int performance=s.nextInt(); 
        s.nextLine();
        
        Student student=new Student();
        student.setName(name);
        student.setAge(age);
        student.setDepartment(department);
        student.setDistrict(district);
        student.setNIC(NIC);
        student.setGender(gender);
        student.setPerformance(performance);
        
        System.out.println(repo.save(student));
        
    }

    @Override
    public void updateStudent() {
      System.out.println("\u001b[H\u001b[2J");
      System.out.println("--------------------------------------------------------");
      System.out.println("|-Welcome to Developer Stack Student Management System-|");
      System.out.println("--------------------------------------------------------");
      System.out.println("----------------");
      System.out.println("|-Update Student-|");
      System.out.println("----------------\n");
      
      
      System.out.print("Enter Student ID : ");
        int id=s.nextInt();
        s.nextLine();
        
        System.out.println(repo.getStudent(id));
        
      System.out.print("Enter Student Name : ");
        String name=s.nextLine();        

        System.out.print("Enter Student Age : ");
        int age=s.nextInt();
        s.nextLine();

        System.out.print("Enter Student Department : ");
        String department=s.nextLine();

        System.out.print("Enter Student District : ");
        String district=s.nextLine();

        System.out.print("Enter Student NIC : ");
        String NIC =s.nextLine();

        System.out.print("Enter Student Gender : ");
        String gender=s.nextLine();

        System.out.print("Enter Student Performance : ");
        int performance=s.nextInt(); 
        s.nextLine();
        
        Student student=new Student();
        student.setName(name);
        student.setAge(age);
        student.setDepartment(department);
        student.setDistrict(district);
        student.setNIC(NIC);
        student.setGender(gender);
        student.setPerformance(performance);
        student.setId(id);
        
        
        System.out.println(repo.update(student));
    }

    @Override
    public void searchStudent() {
        System.out.println("\033[H\033[2J");
        Scanner s = new Scanner(System.in);
        System.out.println("--------------------------------------------------------");
        System.out.println("|-Welcome to Developer Stack Student Management System-|");
        System.out.println("--------------------------------------------------------");
        System.out.println("------------------");
        System.out.println("|-Search Student-|");
        System.out.println("------------------\n");
        
        System.out.print("Enter Student ID : ");
        int id=s.nextInt();
        
        System.out.println(repo.getStudent(id));
        
    }

    @Override
    public void viewAllStudents() {
        System.out.println("\033[H\033[2J");
        System.out.println("--------------------------------------------------------");
        System.out.println("|-Welcome to Developer Stack Student Management System-|");
        System.out.println("--------------------------------------------------------");
        System.out.println("--------------------");
        System.out.println("|-View all Student-|");
        System.out.println("--------------------\n");
        
        System.out.println(repo.getAllStudents());
    }

    @Override
    public void removeStudent() {
        Scanner s = new Scanner(System.in);
        
        System.out.println("--------------------------------------------------------");
        System.out.println("|-Welcome to Developer Stack Student Management System-|");
        System.out.println("--------------------------------------------------------");
        System.out.println("------------------");
        System.out.println("|-Remove Student-|");
        System.out.println("------------------\n");
        
        System.out.print("Enter ID : ");
        int id=s.nextInt();
        s.nextLine();
        
        System.out.println(repo.deleteStudent(id));
    }

    
}
