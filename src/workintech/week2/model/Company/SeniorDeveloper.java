package workintech.week2.model.Company;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(long id, String name) {
        super(id, name);
    }

    public void work() {
        setSalary(50000);
        System.out.println(getName() + "senior developer starts to working...");
    }
}
