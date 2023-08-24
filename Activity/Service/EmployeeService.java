package Activity.Service;

import Activity.DAO.EmployeeDAO;
import Activity.Model.Employee;
import java.util.*;

public class EmployeeService {
    private Scanner scan;
    private EmployeeDAO employeeDAO;

    public EmployeeService(){
        scan =  new Scanner(System.in);
        employeeDAO = new EmployeeDAO();
    }

    public void insert(){
        System.out.println("Enter no of records u want to enter");
		int noOfEmployees=scan.nextInt();
		for(int x=1;x<=noOfEmployees;x++)
		{
			Employee s=new Employee();
			System.out.println("Enter employee's id ");
			s.setEmployee_id(scan.nextInt());
			System.out.println("Enter employee's name ");
			s.setEmployee_name(scan.next());
			System.out.println("Enter employee's address ");
			s.setEmployee_address(scan.next());
			System.out.println("Enter employee's salary ");
			s.setEmployee_salary(scan.nextFloat());
            System.out.println("Enter employee's phone number ");
			s.setEmployee_contact(scan.nextInt());
            System.out.println("Enter employee's department id ");
			s.setDeparment(scan.nextInt());
			employeeDAO.insert(s);
			
		}
    }

    public void storeEmployeeDetails(){
        employeeDAO.retriveData();
    }
}
