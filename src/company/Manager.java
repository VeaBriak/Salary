package company;

public class Manager implements Employee {
    private int salary;
    private int income;
    private int bonus;

    public Manager(int salary, int income) {
        this.salary = salary;
        this.income = income;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int getMonthSalary() {
        bonus = (int) (salary + (income * 0.05));
        return bonus;
    }

    @Override
    public int compareTo(Employee employee) {
        if (getMonthSalary() > employee.getMonthSalary()) {
            return 1;
        }
        if (getMonthSalary() < employee.getMonthSalary()) {
            return -1;
        }
        return 0;
    }
}
