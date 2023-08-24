package Activity.Model;
import java.util.Objects;

public class Employee {
    private int employee_id;
    private String employee_name;
    private float employee_salary;
    private String employee_address;
    private int employee_contact;
    private int deparment;


    public Employee() {
    }

    public Employee(int employee_id, String employee_name, float employee_salary, String employee_address, int employee_contact, int deparment) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
        this.employee_address = employee_address;
        this.employee_contact = employee_contact;
        this.deparment = deparment;
    }

    public int getEmployee_id() {
        return this.employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return this.employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public float getEmployee_salary() {
        return this.employee_salary;
    }

    public void setEmployee_salary(float employee_salary) {
        this.employee_salary = employee_salary;
    }

    public String getEmployee_address() {
        return this.employee_address;
    }

    public void setEmployee_address(String employee_address) {
        this.employee_address = employee_address;
    }

    public int getEmployee_contact() {
        return this.employee_contact;
    }

    public void setEmployee_contact(int employee_contact) {
        this.employee_contact = employee_contact;
    }

    public int getDeparment() {
        return this.deparment;
    }

    public void setDeparment(int deparment) {
        this.deparment = deparment;
    }

    public Employee employee_id(int employee_id) {
        setEmployee_id(employee_id);
        return this;
    }

    public Employee employee_name(String employee_name) {
        setEmployee_name(employee_name);
        return this;
    }

    public Employee employee_salary(float employee_salary) {
        setEmployee_salary(employee_salary);
        return this;
    }

    public Employee employee_address(String employee_address) {
        setEmployee_address(employee_address);
        return this;
    }

    public Employee employee_contact(int employee_contact) {
        setEmployee_contact(employee_contact);
        return this;
    }

    public Employee deparment(int deparment) {
        setDeparment(deparment);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) o;
        return employee_id == employee.employee_id && Objects.equals(employee_name, employee.employee_name) && employee_salary == employee.employee_salary && Objects.equals(employee_address, employee.employee_address) && employee_contact == employee.employee_contact && Objects.equals(deparment, employee.deparment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee_id, employee_name, employee_salary, employee_address, employee_contact, deparment);
    }

    @Override
    public String toString() {
        return "{" +
            " employee_id='" + getEmployee_id() + "'" +
            ", employee_name='" + getEmployee_name() + "'" +
            ", employee_salary='" + getEmployee_salary() + "'" +
            ", employee_address='" + getEmployee_address() + "'" +
            ", employee_contact='" + getEmployee_contact() + "'" +
            ", deparment='" + getDeparment() + "'" +
            "}";
    }
    
}
