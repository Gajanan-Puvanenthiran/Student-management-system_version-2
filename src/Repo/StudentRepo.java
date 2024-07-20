
package Repo;

import javaapplication4.object.Student;


public interface StudentRepo {
    public abstract String save(Student student);
    
    public abstract String update(Student student);
    
    public abstract String getStudent(int id);
    
    public abstract String getAllStudents();
    
    public abstract String deleteStudent(int id);
}
