
package Repo.RepoImplement;

import Repo.StudentRepo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication4.config.DbConfig;
import javaapplication4.object.Student;



public class StudentRepoImplement implements StudentRepo {
    private static DbConfig dbconfig=DbConfig.getInstance();

    @Override
    public String save(Student student) {
        String sql="insert into students (name,age,department,district,NIC,gender,performance)" + "values (?,?,?,?,?,?,?)";
        try(Connection con=dbconfig.dbconnection()){
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setString(1, student.getName());
            ps.setInt(2, student.getAge());
            ps.setString(3, student.getDepartment());
            ps.setString(4, student.getDistrict());
            ps.setString(5,student.getNIC());
            ps.setString(6, student.getGender());
            ps.setInt(7, student.getPerformance());
            
            int row=ps.executeUpdate();
            
            if(row>0){
                return "Succesfully done";
            }
            else{
            return "Something went wrong";
            }
        }
        catch(Exception e){
            return e.toString();
        }
    }

    @Override
    public String update(Student student) {
        
        String sql="update students set name=?, age=?, department=?, district=?, NIC=?, gender=?, performance=? where id=?";
        try(Connection con=dbconfig.dbconnection()){
            
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setString(1, student.getName());
            ps.setInt(2, student.getAge());
            ps.setString(3, student.getDepartment());
            ps.setString(4, student.getDistrict());
            ps.setString(5,student.getNIC());
            ps.setString(6, student.getGender());
            ps.setInt(7, student.getPerformance());
            ps.setInt(8, student.getId());
            
            int row=ps.executeUpdate();
            
            if(row>0){
                return "Succesfully done";
            }
            else{
            return "Something went wrong";
            }
        }
        catch(Exception e){
            return e.toString();
        }
    }

    @Override
    public String getStudent(int id) {
       try{
            Connection con=dbconfig.dbconnection();
        CallableStatement cs=con.prepareCall("{call GetById(?)}");
        cs.setInt(1, id);
        ResultSet rs=cs.executeQuery();
     
        if(rs.next()){
            return rs.getInt(1)+"\n"+rs.getString(2)+"\n"+rs.getInt(3)+"\n"+rs.getString(4)+"\n"+rs.getString(5)+"\n"+rs.getString(6)+"\n"+rs.getString(7)+"\n"+rs.getInt(8);
            
        }
        else {
                return "No student found with ID: " + id;
            }
        }
        catch(Exception e){
        return e.toString();
        }
    }

    @Override
    public String getAllStudents() {
        String sql="select * from students";
        StringBuilder table = new StringBuilder();
        
        table.append(String.format("%-10s %-20s %-10s %-20s %-20s %-15s %-10s %-15s%n",
        "ID", "Name", "Age", "Department", "District", "NIC", "Gender", "Performance"));
    table.append("-----------------------------------------------------------------------------------------------------------------------------\n");
    
        
        try(Connection con = dbconfig.dbconnection()){
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            while (rs.next()) {
            table.append(String.format("%-10d %-20s %-10d %-20s %-20s %-15s %-10s %-15d%n",
                rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getString("department"),
                rs.getString("district"), rs.getString("NIC"), rs.getString("gender"), rs.getInt("performance")));
            }
            table.append("-----------------------------------------------------------------------------------------------------------------------------\n");
            return table.toString();

        }
        catch(Exception e){
        return e.toString();
        }
    }

    @Override
    public String deleteStudent(int id) {
        String sql="delete from students where id= ?";
        
        try(Connection con=dbconfig.dbconnection()){
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1, id);
        int row=ps.executeUpdate();
         return "Success";
        }
        catch(Exception e){
        return e.toString();
        }
    }
    
}
