public class EmployeeService {
    Employee[] employees;
    //public EmployeeService(){}
    public EmployeeService(Employee[] employees){
        this.employees = employees;
    }

    void printEmployee(Employee[] employee){
        for (Employee e: employee) {
            System.out.println(e.getClass().getName() + " name = " + e.getName() + ", id= " +e.getId() + ", age= "+ e.getAge() +
                    " salary= " + e.getSalary() + ", gender= " + e.getGender() + "" + e.getInfo());
        }
    }

    void printEmployee(Employee employee){
            System.out.println(employee.getClass().getName() + " name = " + employee.getName() + ", id= " + employee.getId() + ", age= "+ employee.getAge() +
                    " salary= " + employee.getSalary() + ", gender= " + employee.getGender() + "" + employee.getInfo());
    }


    double calculateSalaryAndBonus(){
        double allMoney=0;
        for(int i = 0; i< employees.length; i++){
            allMoney += employees[i].getSalary();
        }
        return allMoney;
    }

    // Employee[] getById(long id){ -> возвращает сотрудника по заданному id
    Employee getById(long id){
        for (int i = 0; i < employees.length; i++) {
            Employee currentEmployee = employees[i];
            if(currentEmployee.id == id){
                return currentEmployee;
            }
        }
        return null;
    }

    // Employee[] getByName(String name) возвращает сотрудника по заданному имени
    Employee getByName(String name){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].name.equals(name)){
                Employee findName = employees[i];
                return findName;
            }
        }
        return null;
    }
    //  Sort by name - Доробити!!
    Employee[] sortByName(){
        for (int i = 0; i < employees.length-1; i++) {
            for (int j = 0; j < employees.length-1; j++) {
                int value = (employees[j].name.compareTo(employees[j+1].name));
                if(value > 0){
                    Employee temp = employees[j+1];
                    employees[j+1] = employees[j];
                    employees[j] = temp;
                }
            }
        }
        return employees;
    }


    //Employee[] sortByNameAndSalary() -> возвращают отсортированный массив с сотрудниками по критерию ДОРОБИТИ!
    Employee[] sortByNameAndSalary(){
        for (int i = 0; i < employees.length-1; i++) {
            for (int j = 0; j < employees.length-1; j++) {
                int valueByName = (employees[j].name.compareTo(employees[j+1].name));
                if(valueByName > 0){
                    Employee temp = employees[j+1];
                    employees[j+1] = employees[j];
                    employees[j] = temp;
                } else if(valueByName == 0 && employees[j].salary < employees[j+1].salary){
                    double tempSalary = employees[j+1].salary;
                    employees[j+1].salary = employees[j].salary;
                    employees[j].salary = tempSalary;
                }
            }
        }
        return employees;
    }

    /**Employee edit(Employee) -> находит сотрудника по id, и подменяет информацию о нем на новую.
     Старую версию сотрудника метод возвращает.
     */
    Employee edit (Employee newEmployee, long id) {
        for (int i = 0; i < employees.length; i++) {
            Employee currentEmployee = employees[i];
            if (currentEmployee.id == id) {
                employees[i] = newEmployee;
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
        for(int i = 0; i< employees.length; i++){
            Employee temp = employees[i];
            if(temp.id == id){
                indexToDelete = i;
                break;
            }
        }
        if(indexToDelete == -1){
            return null;
        }
        int newArrayCounter = 0;
        Employee[] newUpdateArray  = new Employee[employees.length-1];
        for (int i = 0; i < employees.length; i++) {
            if(indexToDelete != i){
                newUpdateArray[newArrayCounter] = employees[i];
                newArrayCounter++;
            }
        }
        Employee oldDeleteEmployee = employees[indexToDelete];
        employees = newUpdateArray;
        return oldDeleteEmployee;
    }





    //void add(Employee) -> Добавляет нового сотрудника. Массив увеличивается на 1.
    void add(Employee addEmployee){
        Employee[] newAddEmployeesArray = new Employee[employees.length+1];//21
        int lastIndex = newAddEmployeesArray.length-1; //20
        for (int i = 0; i < employees.length; i++) {
            newAddEmployeesArray[i] = employees[i];
        }
        newAddEmployeesArray[lastIndex] = addEmployee;
        employees = newAddEmployeesArray;
        printEmployee(employees);

    }
}