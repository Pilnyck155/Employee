public class Designer extends Employee{

    public Designer(){
    }
    public Designer(int id, String name, int age, double salary, String gender, String info) {
        super(id, name, age, salary, gender, info);
        rate = 0;
        workedDays = 0;
    }

    @Override
    double getSalary() {
        double designerSalary = super.salary;
         return designerSalary + rate * workedDays;
    }

    String getInfo(){
            return info = ", rate= "+ getRate() + ", worked days= " + getWorkedDays();
    }

    public double getRate() {
        return rate;
    }
    int getWorkedDays(){
        return workedDays;
    }
    double rate;
    int workedDays;
}
