public class Employee {
    int id;
    String name;
    int age;
    double salary;
    String gender;

    public Employee(){}

    public Employee(int id, String name, int age, double salary, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    double getSalary(){
        return salary;
    }
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    String getGender(){
        return gender;
    }

}
