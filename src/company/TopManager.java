package company;

import java.util.ArrayList;
import java.util.Collections;

public class TopManager implements Employee {
    private int salary;
    private int prize;
    private int income;
    private ArrayList<Manager> subordinates = new ArrayList<>();
    private int totalProfit;

    public TopManager( int income) {
        this.salary = salary;
        this.income = income;
    }

    public TopManager() {
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getSalary() {
        for (int i = 0; i < subordinates.size(); i++) {
            salary += (int) (subordinates.get(i).getIncome() * 0.1);
        }
        return salary;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public int getIncome() {
        for (int i = 0; i < subordinates.size(); i++) {
            income += subordinates.get(i).getIncome();
        }
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setTotalProfit(int income) {
        this.totalProfit = income;
    }

    public int getTotalProfit(){
        return totalProfit;
    }

    public void addManager(Manager manager){
        subordinates.add(manager);
    }

    public void deleteManager(Manager manager){
        subordinates.remove(manager);
    }

    public ArrayList<Manager> getSubordinates(){
        return subordinates;
    }

    @Override
    public int getMonthSalary() {
        if (totalProfit >= 10000000) {
            this.prize = (int) (salary + (totalProfit * 0.002));
            return prize;
        } else
            return salary;
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

    public Employee get(int i) {
        return subordinates.get(i);
    }

    public int size() {
        return  subordinates.size();
    }

    public void print() {
        System.out.println("Список заработных плат всех менеджеров:");
        Collections.sort(subordinates);
        for (Employee employee : subordinates) {
            System.out.println(employee.getMonthSalary());
        }
    }

}
