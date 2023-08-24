package Activity.DAO;

import Activity.Util.DataConnect;
import Activity.Model.Employee;
import java.sql.*;
import java.util.*;

public class EmployeeDAO {
    private Scanner scan;
    private PreparedStatement stat;
    private Connection con;

    public EmployeeDAO(){
        scan = new Scanner(System.in);
        con = DataConnect.getConnect(); 
    }

    public void insert(Employee employee){
        try {
            stat = con.prepareStatement("INSERT INTO Employee VALUES (?,?,?,?,?,?) ");
            stat.setInt(1, employee.getEmployee_id());
            stat.setString(2, employee.getEmployee_name());
            stat.setString(3, employee.getEmployee_address());
            stat.setFloat(4,employee.getEmployee_salary());
            stat.setInt(5,employee.getEmployee_contact());
            stat.setInt(6,employee.getDeparment());

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
            stat = con.prepareStatement("SELECT * FROM Employee;");
            ResultSet rs = stat.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt(1)+"  "+rs.getString(2) +"  "+rs.getString(3)+"  "+rs.getFloat(4)+"  "+rs.getInt(5)+"  "+rs.getInt(6));
            }
        } catch (SQLException ex) {
            System.out.println("Error occured while executing query");
            ex.printStackTrace();
        }
    }
}
