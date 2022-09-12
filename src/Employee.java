public class Employee {
    public static int counter = 0;
    private Integer id;
    private String name;
    private String lastName;
    private String middleName;
    private int department;
    private int salary;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary() {
        this.salary = salary;
    }

    public Employee(String name, String lastName, String middleName, int department, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", имя='" + name + '\'' +
                ", фамилия='" + lastName + '\'' +
                ", отчество='" + middleName + '\'' +
                ", отдел=" + department +
                ", зарплата=" + salary +
                '}';
    }
}
