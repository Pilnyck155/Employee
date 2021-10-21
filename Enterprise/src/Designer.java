public class Designer extends Employee{
    double rate;
    int workedDays;

    public Designer(int id, String name, int age, double salary, String gender) {
        super(id, name, age, salary, gender);
        rate = 1.1;
        workedDays = 20;

    }


    @Override
    double getSalary() {
        double designerSalary = super.salary;
         return designerSalary + rate * workedDays;
    }

    public double getRate() {
        return rate;
    }
    int getWorkedDays(){
        return workedDays;
    }
}
