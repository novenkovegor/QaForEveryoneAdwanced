package homework.hw7;

public class Employee {

    int BaseSalary;
    String Name;
    int Salary;

    public Employee(int baseSalary, String name, int salary) {
        BaseSalary = baseSalary;
        Name = name;
        Salary = salary;
    }

    public int getBaseSalary() {
        return BaseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        BaseSalary = baseSalary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
