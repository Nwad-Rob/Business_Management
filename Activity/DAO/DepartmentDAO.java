package Activity.DAO;

import java.util.*;
import java.sql.*;
import Activity.Model.Department;
import Activity.Util.DataConnect;

public class DepartmentDAO {
    private Scanner scan;
    private PreparedStatement stat;
    private Connection con;

    public DepartmentDAO(){
        scan = new Scanner(System.in);
        con = DataConnect.getConnect(); 
    }

    public void insert(Department dept){
        try {
            stat = con.prepareStatement("INSERT INTO Department VALUES (?,?,?,?) ");
            stat.setInt(1, dept.getDepartment_id());
            stat.setString(2, dept.getDepartment_name());
            stat.setString(3, dept.getDepartment_head());
            stat.setString(4,dept.getNo_of_employees());
         
            int result = stat.executeUpdate();
            if (result > 0){
               System.out.println("Data Inserted");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void retriveData(){
        try {
            con.createStatement();
            stat = con.prepareStatement("SELECT * FROM Department;");
            ResultSet rs = stat.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt(1)+"  "+rs.getString(2) +"  "+rs.getString(3)+"  "+rs.getString(4));
            }
        } catch (SQLException ex) {
            System.out.println("Error occured while executing query");
            ex.printStackTrace();
        }
    }
}