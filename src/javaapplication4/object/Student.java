
package javaapplication4.object;


public class Student {
    private int id;
    private String name;
    private int age;
    private String department;
    private String district;
    private String NIC;
    private String gender;
    private int performance;
    
    public Student(){
    }
    
    public Student(int id,String name,int age,String department,String district,String NIC,String gender,int performance){
        this.id=id;
        this.name=name;
        this.age=age;
        this.department=department;
        this.district=district;
        this.NIC=NIC;
        this.gender=gender;
        this.performance=performance;
             
    }
    
    public Student(String name,int age,String department,String district,String NIC,String gender,int performance){
        this.name=name;
        this.age=age;
        this.department=department;
        this.district=district;
        this.NIC=NIC;
        this.gender=gender;
        this.performance=performance;
             
    }
    
    public void setName(String name){
    this.name=name;
    }
    
    public void setAge(int age){
    this.age=age;
    }
    
    public void setDepartment(String department){
    this.department=department;
    }
    
    public void setDistrict(String district){
    this.district=district;
    }
    
    public void setNIC(String NIC){
    this.NIC=NIC;
    }
    
    public void setGender(String gender){
    this.gender=gender;
    }
    
    public void setPerformance(int performance){
    this.performance=performance;
    }
    
    public void setId(int id){
    this.id=id;
    }
    
    public String getName(){
    return name;
    }
    
    public int getAge(){
    return age;
    }
    
    public String getDepartment(){
    return department;
    }
    
    public String getDistrict(){
    return district;
    }
    
    public String getNIC(){
    return NIC;
    }
    
    public String getGender(){
    return gender;
    }
    
    public int getPerformance(){
    return performance;
    }
    
    public int getId(){
    return id;
    }
}
