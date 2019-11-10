package company;
import java.util.ArrayList;
import java.util.Collections;


public class Company {
    private ArrayList<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public ArrayList<Employee> getTopSalaryStaff(int count) {
        Collections.sort(employees);
        System.out.println("Максимальные зарплаты среди сотрудников:");
//        ArrayList<Employee> topSalary = new ArrayList<>();
//        for(int i = 1; i <= count; i++){
//            topSalary.add(employees.get(employees.size() - i));
//        }
        for (int i = 1; i <= count; i++) {
            System.out.println(employees.get(employees.size() - i).getMonthSalary());
        }
        //return (topSalary);
        return null;
    }

    public ArrayList<Employee> getLowestSalaryStaff(int count) {
        Collections.sort(employees);
        System.out.println("Минимальные зарплаты среди сотрудников:");
        for (int i = 0; i < count; i++) {
            System.out.println(employees.get(i).getMonthSalary());
        }
        return null;
    }

    public void addEmployee(Employee element) {
        employees.add(element);

    }

    public Employee deleteEmployee(Employee element) {
        employees.remove(element);
        return null;
    }

    public int size() {
        return employees.size();
    }

    public void print() {
        System.out.println("Список заработных плат всех сотрудников:");
        Collections.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee.getMonthSalary());
        }
    }

    public void sort() {
        Collections.sort(employees);
    }

}
