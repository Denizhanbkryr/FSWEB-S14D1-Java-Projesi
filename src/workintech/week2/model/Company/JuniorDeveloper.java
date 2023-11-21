package workintech.week2.model.Company;

public class JuniorDeveloper extends Employee{

    public JuniorDeveloper(long id, String name) {
        super(id, name);
    }

public void work(){
        setSalary(32000);
        System.out.println(getName() + " junior has start to working..." );
}


}
