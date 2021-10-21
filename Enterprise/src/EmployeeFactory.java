import java.util.Random;

public class EmployeeFactory {
    Employee[] generateEmployees(int size){ // 10
        Random random = new Random();
        int developersCount = random.nextInt(size)/2; //3
        int managersCount = (size - developersCount)/2; //3
        int designersCount = size - developersCount - managersCount;

        Developer[] developers = new Developer[developersCount];
        Manager[] managers = new Manager[managersCount];
        Designer[] designers = new Designer[designersCount];
        Employee[] newRandomEmployees = new Employee[size];


        String[] randomManNames = {"Ihor", "Mykola", "Oleh", "Andriy", "Dmytro", "Yaroslav"};
        String[] randomWomanNames = {"Yana", "Anna", "Olga", "Sophia", "Oksana", "Maria", "Anastasia"};
        String[] gender = {"man", "woman"};



        for (int i = 0; i < size; i++) {
            Employee employee = new Employee();
            employee.id = i+1;
            employee.gender = gender[random.nextInt(gender.length)];
            if(employee.gender.equals("woman")){
                employee.name = randomWomanNames[random.nextInt(randomWomanNames.length)];
            } else {
                employee.name = randomManNames[random.nextInt(randomManNames.length)];
            }
            employee.age = random.nextInt(25)+18;
            employee.salary = random.nextInt(10_000)+2_000;
            newRandomEmployees[i] = employee;
        }
        return newRandomEmployees;
    }
}
