public class Test {
    public static void main(String[] args){
        EmployeeFactory employeeFactory = new EmployeeFactory();
        Employee [] defaultEmployee = employeeFactory.generateEmployees(10);
        //Designer[] defaultDesigner = employeeFactory.generateEmployees(5);

       // EmployeeService employeeService = new EmployeeService(defaultEmployee, defaultDesigner);

        //employeeService.printEmployee(defaultDesigner);

        //employeeService.printEmployee(defaultEmployee);


    }
}
