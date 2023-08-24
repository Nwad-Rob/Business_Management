package Activity.Model;
import java.util.Objects;

public class Department {
    private int department_id;
    private String department_name;
    private String department_head;
    private String no_of_employees;


    public Department() {
    }

    public Department(int department_id, String department_name, String department_head, String no_of_employees) {
        this.department_id = department_id;
        this.department_name = department_name;
        this.department_head = department_head;
        this.no_of_employees = no_of_employees;
    }

    public int getDepartment_id() {
        return this.department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return this.department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getDepartment_head() {
        return this.department_head;
    }

    public void setDepartment_head(String department_head) {
        this.department_head = department_head;
    }

    public String getNo_of_employees() {
        return this.no_of_employees;
    }

    public void setNo_of_employees(String no_of_employees) {
        this.no_of_employees = no_of_employees;
    }

    public Department department_id(int department_id) {
        setDepartment_id(department_id);
        return this;
    }

    public Department department_name(String department_name) {
        setDepartment_name(department_name);
        return this;
    }

    public Department department_head(String department_head) {
        setDepartment_head(department_head);
        return this;
    }

    public Department no_of_employees(String no_of_employees) {
        setNo_of_employees(no_of_employees);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Department)) {
            return false;
        }
        Department department = (Department) o;
        return department_id == department.department_id && Objects.equals(department_name, department.department_name) && Objects.equals(department_head, department.department_head) && no_of_employees == department.no_of_employees;
    }

    @Override
    public int hashCode() {
        return Objects.hash(department_id, department_name, department_head, no_of_employees);
    }

    @Override
    public String toString() {
        return "{" +
            " department_id='" + getDepartment_id() + "'" +
            ", department_name='" + getDepartment_name() + "'" +
            ", department_head='" + getDepartment_head() + "'" +
            ", no_of_employees='" + getNo_of_employees() + "'" +
            "}";
    }
    
}
