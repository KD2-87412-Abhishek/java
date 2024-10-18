public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("ab", "av", 5000);
        Employee employee2 = new Employee("abbb", " sds", 6000);

        
        System.out.println(employee1 + ", Yearly Salary: " + employee1.getYearlySalary());
        System.out.println(employee2 + ", Yearly Salary: " + employee2.getYearlySalary());

        employee1.giveRaise(50);
        employee2.giveRaise(70);

        
        System.out.println(employee1 + ", Yearly Salary: " + employee1.getYearlySalary());
        System.out.println(employee2 + ", Yearly Salary: " + employee2.getYearlySalary());
    }
}