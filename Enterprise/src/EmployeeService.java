

public class EmployeeService {
    Employee[] employee;
    Developer[] developers;
    Manager[] managers;
    Designer[] designers;

    public EmployeeService(Employee[] employee, Developer[] developers, Manager[] managers, Designer[] designers){
        this.employee = employee;
        this.developers = developers;
        this.managers = managers;
        this.designers = designers;
    }
    //ДООПРАЦЮВАТИ
    void printEmployee(Employee[] employee){
        for (Employee e: employee) {
            System.out.println("Employee name = " + e.getName() + ", id= " +e.getId() + ", age= "+ e.getAge() +
                    " salary= " + e.getSalary() + ", gender= " + e.getGender());
        }
    }

}
