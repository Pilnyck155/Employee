import java.util.Random;

public class EmployeeFactory {
    String[] randomManNames = {"Ihor", "Mykola", "Oleh", "Andriy", "Dmytro", "Yaroslav", "Semen", "Stepan", "Vitaliy"};
    String[] randomWomanNames = {"Yana", "Anna", "Olga", "Sophia", "Oksana", "Maria", "Anastasia", "Susana", "Svitlana"};
    String[] gender = {"man", "woman"};
    int nexId = 0;

    Developer[] generateDevelopers(int size){ // 10
        Random random = new Random();
        Developer[] newRandomDevelopers = new Developer[size];

        for (int i = 0; i < size; i++) {
            Developer developer = new Developer();
            developer.id = getId();
            developer.gender = gender[random.nextInt(gender.length)];
            if(developer.gender.equals("woman")){
                developer.name = randomWomanNames[random.nextInt(randomWomanNames.length)];
            } else {
                developer.name = randomManNames[random.nextInt(randomManNames.length)];
            }
            developer.age = random.nextInt(25)+18;
            developer.salary = random.nextInt(10_000)+4_000;
            developer.fixedBugs = random.nextInt(50);
            developer.coefficient = random.nextDouble();
            newRandomDevelopers[i] = developer;
        }
        return newRandomDevelopers;
    }


    Manager[] generateManagers(int size){ // 10
        Random random = new Random();
        Manager[] newRandomManagers = new Manager[size];

        for (int i = 0; i < size; i++) {
            Manager manager = new Manager();
            manager.id = getId();
            manager.gender = gender[random.nextInt(gender.length)];
            if(manager.gender.equals("woman")){
                manager.name = randomWomanNames[random.nextInt(randomWomanNames.length)];
            } else {
                manager.name = randomManNames[random.nextInt(randomManNames.length)];
            }
            manager.age = random.nextInt(25)+18;
            manager.salary = random.nextInt(10_000)+4_000;
            newRandomManagers[i] = manager;
        }
        return newRandomManagers;
    }


    Designer[] generateDesigners(int size){ // 10
        Random random = new Random();
        Designer[] newRandomDesigners = new Designer[size];

        for (int i = 0; i < size; i++) {
            Designer designer = new Designer();
            designer.id = getId();
            designer.gender = gender[random.nextInt(gender.length)];
            if(designer.gender.equals("woman")){
                designer.name = randomWomanNames[random.nextInt(randomWomanNames.length)];
            } else {
                designer.name = randomManNames[random.nextInt(randomManNames.length)];
            }
            designer.age = random.nextInt(25)+18;
            designer.salary = random.nextInt(10_000)+4_000;
            designer.workedDays = random.nextInt(20);
            designer.rate = random.nextDouble();
            newRandomDesigners[i] = designer;
        }
        return newRandomDesigners;
    }

    public Employee[] getDefaultEmployees(int size) {
        Random random = new Random();
        int developersCount = random.nextInt(size)/2; //3
        int managersCount = (size - developersCount)/2; //3
        int designersCount = size - developersCount - managersCount;

        Developer[] developers = generateDevelopers(developersCount);
        Manager[] managers = generateManagers(managersCount);
        Designer[] designers = generateDesigners(designersCount);

        Employee[] newRandomEmployees = new Employee[size];
        int index = 0;
        for (Developer developer: developers) {
            newRandomEmployees[index] = developer;
            index++;
        }
        for (Manager manager : managers) {
            newRandomEmployees[index] = manager;
            index++;
        }
        for (Designer designer : designers) {
            newRandomEmployees[index] = designer;
            index++;
        }
        return newRandomEmployees;
    }

    int getId(){
        this.nexId += 1;
        return nexId;
    }
}
