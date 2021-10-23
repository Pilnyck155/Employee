import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        EmployeeFactory employeeFactory = new EmployeeFactory();

        Employee [] defaultEmployee = employeeFactory.getDefaultEmployees(20);

        EmployeeService employeeService = new EmployeeService(defaultEmployee);
        employeeService.printEmployee(defaultEmployee);

        double employeeSalary = employeeService.calculateSalaryAndBonus();


        //Employee findById = employeeService.getById(4);
        //employeeService.printEmployee(findById);

        //Employee findByName = employeeService.getByName("Anna");
        //employeeService.printEmployee(findByName);

        //employeeService.sortByName();
        //employeeService.printEmployee(defaultEmployee);

        //employeeService.sortByNameAndSalary();
        //employeeService.printEmployee(defaultEmployee);

        //employeeService.edit(defaultEmployee[4],8 );
        //employeeService.printEmployee(defaultEmployee);
        //Employee  removedEmployee = employeeService.remove(4);
        //employeeService.printEmployee(defaultEmployee);
        //employeeService.printEmployee(defaultEmployee[7]);
        employeeService.add(defaultEmployee[1]);
    }
}
