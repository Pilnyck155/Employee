public class EmployeeService {
    Employee [] employee;
/**
 Разработать класс EmployeeService который будет хранить всех сотрудников предприятия в массиве.
 Класс должен содержать методы для работы с сотрудниками (которые представлены массивом внутри класса):
 */
    public EmployeeService(Employee[] employees){
        this.employee = employees;
    }

    // вывод на экран информации о сотрудниках
    void printEmployees(Employee [] employee){
       for (Employee e : employee) {
           System.out.println("Employee name= " + e.name + ", id= "+e.id + ", salary= " + e.salary +
                   ", gender= " + e.gender + ", fixed bugs=" + e.fixedBugs +
                   ", default bug rate = " + e.defaultBugRate);
        }
    }

    //Print one Employee
    void printOneEmployees(Employee employee){
            System.out.println("Employee name= " + employee.name + ", id= "+employee.id + ", salary= " + employee.salary +
                    ", gender= " + employee.gender + ", fixed bugs=" + employee.fixedBugs +
                    ", default bug rate = " + employee.defaultBugRate);
    }

    /**
     * double calculateSalaryAndBonus() -> возвращает количество денег необходимое для
     *  выплаты зарплат для всех сотрудников в этом месяце (пробегаем по всем сотрудникам,
     *  суммируем зарплату каждого с бонусом каждого)
     */
    double calculateSalaryAndBonus(){
        double allMoney=0;
        for(int i=0; i< employee.length; i++){
            allMoney += employee[i].getSalary();
        }
        return allMoney;
    }

    // Employee[] getById(long id){ -> возвращает сотрудника по заданному id
    Employee getById(long id){
        for (int i = 0; i < employee.length; i++) {
            Employee currentEmployee = employee[i];
            if(currentEmployee.id == id){
                return currentEmployee;
            }
        }
        return null;
    }

 // Employee[] getByName(String name) возвращает сотрудника по заданному имени
    Employee getByName(String name){
        for (int i = 0; i < employee.length; i++) {
            if(employee[i].name.equals(name)){
                Employee findName = employee[i];
                return findName;
            }
        }
        return null;
    }
//  Sort by name - DONE!!
    Employee[] sortByName(){
        for (int i = 0; i < employee.length-1; i++) {
            for (int j = 0; j < employee.length-1; j++) {
                int value = (employee[j].name.compareTo(employee[j+1].name));
                if(value > 0){
                    Employee temp = employee[j+1];
                    employee[j+1] = employee[j];
                    employee[j] = temp;
                }
            }
        }
        return employee;
    }


 //Employee[] sortByNameAndSalary() -> возвращают отсортированный массив с сотрудниками по критерию ДОРОБИТИ!
    Employee[] sortByNameAndSalary(){
         for (int i = 0; i < employee.length-1; i++) {
             for (int j = 0; j < employee.length-1; j++) {
                 int valueByName = (employee[j].name.compareTo(employee[j+1].name));
                    if(valueByName > 0){
                        Employee temp = employee[j+1];
                        employee[j+1] = employee[j];
                        employee[j] = temp;
                    } else if(valueByName == 0 && employee[j].salary < employee[j+1].salary){
                        double tempSalary = employee[j+1].salary;
                            employee[j+1].salary = employee[j].salary;
                            employee[j].salary = tempSalary;
                        }
                }
            }
        return employee;
        }

 /**Employee edit(Employee) -> находит сотрудника по id, и подменяет информацию о нем на новую.
 Старую версию сотрудника метод возвращает.
*/
    Employee edit (Employee newEmployee, long id) {
        for (int i = 0; i < employee.length; i++) {
            Employee currentEmployee = employee[i];
            if (currentEmployee.id == id) {
                employee[i] = newEmployee;
                return currentEmployee;
            }
        }
        return null;
    }

 /**
 Employee remove(long id) -> находит сотрудника по id, и удаляет его из массива.
 Возвращает ссылку на удаленного сотрудника.
 */
    Employee remove(long id){
        int indexToDelete = -1;
        for(int i=0; i< employee.length; i++){
            Employee temp = employee[i];
                if(temp.id == id){
                    indexToDelete = i;
                    break;
                }
            }
        if(indexToDelete == -1){
            return null;
        }
        int newArrayCounter = 0;
        Employee[] newUpdateArray  = new Employee[employee.length-1];
        for (int i = 0; i < employee.length; i++) {
            if(indexToDelete != i){
                newUpdateArray[newArrayCounter] = employee[i];
                newArrayCounter++;
            }
        }
        Employee oldDeleteEmployee = employee[indexToDelete];
        employee = newUpdateArray;
        return oldDeleteEmployee;
    }


    Employee[] getSalary(Employee[] employee){
        for (Employee e: employee) {
            e.salary += e.fixedBugs * e.defaultBugRate;
        }
        return employee;
    }
}