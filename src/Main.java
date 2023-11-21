import workintech.week2.model.Company.HRManager;
import workintech.week2.model.Company.JuniorDeveloper;
import workintech.week2.model.Company.MidDeveloper;
import workintech.week2.model.Company.SeniorDeveloper;
import workintech.week2.model.Cylinder.Cylinder;
import workintech.week2.model.Pool.Cuboid;

public class Main {
    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder(1, 3);
        System.out.println("Area = " + cylinder.getArea());
        System.out.println("Volume= " + cylinder.getVolume());

        Cuboid cuboid = new Cuboid(2, 3, 2);
        System.out.println("Area = " + cuboid.getArea());
        System.out.println("Volume = " + cuboid.getVolume());

        System.out.println("***********************************");
        JuniorDeveloper junior1 = new JuniorDeveloper(1, "Mehmet Ali");
        JuniorDeveloper junior2 = new JuniorDeveloper(2, "Gulbeyaz");
        junior1.work();
        junior2.work();
        System.out.println(junior1);
        System.out.println(junior2);

        System.out.println("***********************************");

        MidDeveloper mid1 = new MidDeveloper(3, "Denizhan Bakıryor");
        MidDeveloper mid2 = new MidDeveloper(4, "Ege Bakıryor");
        mid1.work();
        mid2.work();
        System.out.println(mid1);
        System.out.println(mid2);

        System.out.println("***********************************");

        SeniorDeveloper senior1 = new SeniorDeveloper(5, "ayşe eldmle");
        SeniorDeveloper senior2 = new SeniorDeveloper(6, "fatma dkjekjdw");
        senior1.work();
        senior2.work();
        System.out.println(senior1);
        System.out.println(senior2);

        System.out.println("*************************************");
        HRManager hrManager = new HRManager(6, "Dogancan",
                new JuniorDeveloper[2], new MidDeveloper[2], new SeniorDeveloper[2]);
        hrManager.work();
        hrManager.addEmployee(0, junior1);
        hrManager.addEmployee(1, junior2);
        hrManager.addEmployee(0, mid1);
        hrManager.addEmployee(1, mid2);
        hrManager.addEmployee(0, senior1);
        hrManager.addEmployee(1, senior2);

        System.out.println(hrManager);


    }
}