package company;

public class Clerk implements Employee{
    private int salary;

    public Clerk(int salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int getMonthSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee employee) {
        if (getMonthSalary() > employee.getMonthSalary()){
            return 1;
        }
        if (getMonthSalary() < employee.getMonthSalary()){
            return -1;
        }
        return 0;
    }
}
