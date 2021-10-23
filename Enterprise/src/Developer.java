public class Developer extends Employee{


    public Developer(){
    }
    public Developer(int id, String name, int age, double salary, String gender, String info) {
        super(id, name, age, salary, gender, info);
        fixedBugs = 0;
        coefficient = 0;
        randomBoolean = false;
        info = " ";
    }

    @Override
    double getSalary() {
        double developerSalary = super.salary;
        return (developerSalary * fixedBugs * coefficient) * (randomBoolean? 2: 0);
    }

    String getInfo(){
         return info = ", fixedBugs= "+ getFixedBugs() + ", coefficient= "
                 + getCoefficient() + ", randomBoolean= " + isRandomBoolean();
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
    int fixedBugs;
    double coefficient;
    boolean randomBoolean;
}
