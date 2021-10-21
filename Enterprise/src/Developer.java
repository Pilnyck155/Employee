public class Developer extends Employee{
    int fixedBugs;
    double coefficient;
    boolean randomBoolean;

    public Developer(int id, String name, int age, double salary, String gender) {
        super(id, name, age, salary, gender);
        fixedBugs = 100;
        coefficient = 1.5;
        randomBoolean = false;
    }


    @Override
    double getSalary() {
        double developerSalary = super.salary;
        return (developerSalary * fixedBugs * coefficient) * (randomBoolean? 2: 0);
    }

    int getFixedBugs(){
        return fixedBugs;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public boolean isRandomBoolean() {
        return randomBoolean;
    }
}
