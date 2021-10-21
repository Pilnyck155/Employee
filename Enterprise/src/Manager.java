public class Manager extends Employee{


    public Manager(int id, String name, int age, double salary, String gender) {
        super(id, name, age, salary, gender);
    }

    @Override
    double getSalary() {
        return super.getSalary();
    }
}
