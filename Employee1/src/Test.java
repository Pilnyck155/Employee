import java.util.Arrays;

public class Test {
/**
 * Использовать класс Test для создания объекта EmploeeService и тестирования описаных выше методов.
 */
    public static void main(String[] args){
        EmployeeFactory employeeFactory = new EmployeeFactory();
        Employee[] defaultEmployee = employeeFactory.generateEmployees(10);
        EmployeeService employeeService = new EmployeeService(defaultEmployee);

        //print Employeers
        employeeService.printEmployees(defaultEmployee);

        //get Employeers by id
        Employee fineByID = employeeService.getById(6);
        System.out.println();
        //employeeService.printOneEmployees(fineByID);

        //get Employeers by name
        Employee findEmployee = employeeService.getByName("Oksana");
        //employeeService.printOneEmployees(findEmployee);

        //Calculate Salary for all Employeers
        employeeService.calculateSalaryAndBonus();

        //calculate salary for each Employeers
        employeeService.getSalary(defaultEmployee);

        //sort by name of employeer
        employeeService.sortByName();
        //System.out.println();
        //employeeService.printEmployees(defaultEmployee);

        //sort by name and Salary
        employeeService.sortByNameAndSalary();
        //employeeService.printEmployees(defaultEmployee);

        //delete Employee
        employeeService.remove(7);

        employeeService.edit(fineByID, 9);


    }
}
