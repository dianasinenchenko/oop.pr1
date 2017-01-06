package school.lemon.changerequest.java;

/**
 * Created by Diana on 06.01.2017.
 */
public class EmployeesDemo {
    public static void main(String[] args) {
        IAccountantImpl accountant1 = new IAccountantImpl(80, 100);
        IAccountantImpl accountant2 = new IAccountantImpl(120, 100);
        IAccountantImpl accountant3 = new IAccountantImpl(165, 100);

        Programmer programmer1 = new Programmer(180, 100);
        Programmer programmer2 = new Programmer(320, 100);
        Programmer programmer3 = new Programmer(165, 100);

        Manager manager1 = new Manager(80, 100);
        Manager manager2 = new Manager(120, 100);
        Manager manager3 = new Manager(165, 100);


        IAccountantImpl.CalculateCurrentMonthSalary(programmer1.GetWorkHours(), programmer1.GetRate());
        IAccountantImpl.CalculateCurrentMonthSalary(accountant1.GetWorkHours(), accountant1.GetRate());
        IAccountantImpl.CalculateCurrentMonthSalary(manager1.GetWorkHours(), manager1.GetRate());

        System.out.println("Programmer1 workHours -> " + programmer1.GetWorkHours() + " rate -> " + programmer1.GetRate() + " salary -> " + IAccountantImpl.CalculateCurrentMonthSalary(programmer1.GetWorkHours(), programmer1.GetRate()));
    }
}
