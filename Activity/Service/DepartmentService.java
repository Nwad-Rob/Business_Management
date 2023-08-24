package Activity.Service;

import Activity.Model.Department;
import Activity.DAO.DepartmentDAO;
import java.util.*;

public class DepartmentService {
    private Scanner scan;
    private DepartmentDAO deptDAO;

    public DepartmentService(){
        scan = new Scanner(System.in);
        deptDAO = new DepartmentDAO();
    }

    public void insert(){
        System.out.println("Enter no of records u want to enter");
		int noOfDept=scan.nextInt();
		for(int x=1;x<=noOfDept;x++)
		{
			Department s=new Department();
			System.out.println("Enter department's id ");
			s.setDepartment_id(scan.nextInt());
			System.out.println("Enter department's name ");
			s.setDepartment_name(scan.nextLine());
			System.out.println("Enter department head ");
			s.setDepartment_head(scan.nextLine());
			System.out.println("Enter department description ");
			s.setNo_of_employees(scan.nextLine());
			deptDAO.insert(s);
			
		}
    }

    public void storeEmployeeDetails(){
        deptDAO.retriveData();
    }
}
