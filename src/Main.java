import company.*;
import java.util.List;

/**Создайте классы, в которых будет информация о зарплатах сотрудников, и интерфейс “Сотрудник” с методом getMonthSalary().
 * Типы сотрудников - менеджер по продажам (зарплата складывается из фиксированной части и 5% от заработанных им для компании денег),
 * топ-менеджер (фиксированная часть + премия, если доход компании составил более 10 миллионов рублей) и операционист (фиксированная зарплата).
 * Создайте также класс, представляющий компанию, в которой работают эти сотрудники. Их можно нанимать, увольнять. Также в этом классе должны быть реализованы два метода,
 * - getTopSalaryStaff(int count) и getLowestSalaryStaff(int count), - которые будут выводить заданное (в параметре count) количество сотрудников с самыми высокими
 * и самыми низкими зарплатами. Сгенерируйте и наймите 270 сотрудников с разными зарплатами, а затем вызовите эти два метода и продемонстрируйте их работу.**/

public class Main {
    public static void main(String[] args) {
        final int minSalary = 20000;
        final int maxSalary = 30000;
        final int minManagerProfit = 0;
        final int maxManagerProfit = 150000;
        final int employees = 270;

        EmployeeGenerator generator = new EmployeeGenerator(minSalary, maxSalary);
        EmployeeGenerator bonus = new EmployeeGenerator(minManagerProfit, maxManagerProfit);
        Company company = new Company();

        generator.setNumOfEmployees(employees);

        for (int i = 0; i < generator.topManagerNumbers(); i++) {
           // TopManager topManager = new TopManager(generator.getTopManagerSalary(), generator.getTotalProfit());
            TopManager topManager = new TopManager(generator.getTotalProfit());
            for (int j = 0; j < 15; j++) {
                Manager manager = new Manager(generator.getRandomSalary(), bonus.getRandomSalary());
                generator.setTotalProfit(bonus.getRandomSalary());
                topManager.addManager(manager);
                company.addEmployee(manager);
                System.out.println("man : " + manager.getIncome());
            }
            topManager.setTotalProfit(generator.getTotalProfit());
            company.addEmployee(topManager);
            System.out.println("topMan salary : " + topManager.getSalary() + "/ salary + bonus: " + topManager.getMonthSalary() + "/ company profit " + topManager.getTotalProfit());
          //  topManager.print();
        }

        for (int i = 0; i < generator.clerkNumbers(); i++) {
            Clerk clerk = new Clerk(generator.getRandomSalary());
            company.addEmployee(clerk);
        }
        company.print();
        System.out.println("Общее количество сотрудников: " + company.size() + " из них:\n" +
                "менеджеров: " + generator.managerNumbers() + "\nтоп-менеджеров: " + generator.topManagerNumbers() +
                "\nоперационистов: " + generator.clerkNumbers());
        System.out.println("Общая прибыль компании: " + generator.getTotalProfit());
        company.getLowestSalaryStaff(2);
        company.getTopSalaryStaff(2);
//        List<Employee> list = company.getTopSalaryStaff(2);
//        for (Employee employee : list){
//            System.out.println(employee.getMonthSalary());
//        }
    }

}
