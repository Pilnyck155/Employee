public class Employee {

    Employee(){    }
    Employee(long id, String name, int age, double salary, String gender, int fixedBugs, double defaultBugRate){
        this.id =id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.fixedBugs = fixedBugs;
        this.defaultBugRate = defaultBugRate;
    }

    double getSalary(){
        return salary += fixedBugs * defaultBugRate;
    }

    long id;
    String name;
    int age;
    double salary;
    String gender;
    int fixedBugs;
    double defaultBugRate;
}
/**
 * Разработать приложение по учету сотрудников предприятия.
 * Каждый сотрудник имеет следующие свойства
 * id, name, age, salary, gender, fixedBugs, defaultBugRate
 *
 * salary - ставка сотрудника которую он получает каждый месяц
 * на основании полей fixedBugs и defaultBugRate можно рассчитать бонус
 * который сотрудник получит к зарплате в этом месяце
 */
