public class Employee {


    public Employee(){}

    public Employee(int id, String name, int age, double salary, String gender, String info) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.info = info;
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
    String getInfo(){
        return info;
    }

    int id;
    String name;
    int age;
    double salary;
    String gender;
    String info;
}
