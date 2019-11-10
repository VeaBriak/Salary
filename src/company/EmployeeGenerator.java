package company;

public class EmployeeGenerator {
    private int minSalary;
    private int maxSalary;
    private int randomSalary;
    private int numOfEmployees;
    private int totalProfit;
    private int topManagerSalary;
    private int count;

    public EmployeeGenerator(int min, int max) {
        this.minSalary = min;
        this.maxSalary = max;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public int getRandomSalary() {
        randomSalary = rnd(minSalary, maxSalary);
        return randomSalary;
    }

    public void setRandom(int random) {
        this.randomSalary = random;
    }

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    public void setNumOfEmployees(int command) {
        this.numOfEmployees = command;
    }

    public int getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(int command) {
        this.totalProfit += command;
    }

    public void setTopManagerSalary(int command){
        this.topManagerSalary = (int) (command * 0.5);
    }

    public int getTopManagerSalary(){
        return topManagerSalary;
    }

    private int rnd(int minSalary, int maxSalary) {
        maxSalary -= minSalary;
        return (int) (Math.random() * ++maxSalary) + minSalary;
    }

    public int managerNumbers() {
        int num = topManagerNumbers() * 15;
        return num;
    }

    public int topManagerNumbers() {
        int num = (int) (numOfEmployees * 0.05);
        return num;
    }

    public int clerkNumbers() {
        int num = numOfEmployees - managerNumbers() - topManagerNumbers();
        return num;
    }
}
