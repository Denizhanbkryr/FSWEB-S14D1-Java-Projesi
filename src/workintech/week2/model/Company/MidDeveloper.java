package workintech.week2.model.Company;

public class MidDeveloper extends Employee{


    public MidDeveloper(long id, String name) {
        super(id, name);
    }

    public void work(){
        setSalary(40000);
        System.out.println(getName() + " mid developer starts to working...");
    }

}
