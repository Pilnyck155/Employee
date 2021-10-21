import java.util.Random;

public class EmployeeFactory {
/**
 * generateEmployees(size) -> генерирует случайным образом заданое количество сотрудников
 */
    Employee[] generateEmployees(int size) {

        /**
        Employee Petro = new Employee(1, "Petro", 25, 11_000, "man", 300, 1.4);
        Employee Mykola = new Employee(2, "Mykola", 26, 10_500, "man", 250, 1.3);
        Employee Anna = new Employee(3, "Anna", 23, 10_000, "woman", 120, 0.8);
        Employee Oksana = new Employee(4, "Oksana", 30, 12_000, "woman", 540, 1.6);
        Employee Yaroslav = new Employee(5, "Yaroslav", 27, 10_100, "man", 240, 1.5);
        Employee Dmytro = new Employee(6, "Dmytro", 31, 12_100, "man", 341, 1.5);
        Employee Stepan = new Employee(7, "Stepan", 32, 13_120, "man", 550, 1.9);
        Employee Mykyta = new Employee(8, "Mykola", 28, 18_120, "man", 743, 2.0);
        Employee Myron = new Employee(9, "Mykola", 29, 19_120, "man", 745, 2.1);

        Employee[] employee = {Petro, Mykola, Anna, Oksana, Yaroslav, Dmytro, Stepan, Mykyta, Myron};
        return employee;
        */
        Random random = new Random();
        String[] randomManNames = {"Ihor", "Mykola", "Oleh", "Andriy", "Dmytro", "Yaroslav"};
        String[] randomWomanNames = {"Yana", "Anna", "Olga", "Sophia", "Oksana"};
        String[] gender = {"man", "woman"};
        Employee[] randomEmployee = new Employee[size];
        for (int i = 0; i < size; i++) {
            Employee employee = new Employee();
            employee.id = i+1;
            employee.age = random.nextInt(40) + 18;
            employee.gender = gender[random.nextInt(gender.length)];
            if(employee.gender.equals("man")){
                employee.name = randomManNames[random.nextInt(randomManNames.length)];
            } else {
                employee.name = randomWomanNames[random.nextInt(randomWomanNames.length)];
            }
            employee.salary = random.nextDouble() * 50000;
            employee.fixedBugs = random.nextInt(100);
            employee.defaultBugRate = random.nextDouble()+0.2;

            randomEmployee[i] = employee;
        }
    return randomEmployee;
    }
}