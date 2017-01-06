package school.lemon.changerequest.java;

/**
 * Created by Diana on 06.01.2017.
 */
public class EmployeesDemo {
    public static void main(String[] args) {
        IAccountantImpl accountant1 = new IAccountantImpl(80, 100,"Olya");
        IAccountantImpl accountant2 = new IAccountantImpl(120, 100,"Olya");
        IAccountantImpl accountant3 = new IAccountantImpl(165, 100,"Olya");

        Programmer programmer1 = new Programmer(180, 100,"Diana");
        Programmer programmer2 = new Programmer(320, 100,"Di");
        Programmer programmer3 = new Programmer(165, 100,"Dayana");

        Manager manager1 = new Manager(80, 100,"Dima");
        Manager manager2 = new Manager(120, 100,"Sasha");
        Manager manager3 = new Manager(165, 100,"Pasha");


        IAccountantImpl.CalculateCurrentMonthSalary(programmer1.GetWorkHours(), programmer1.GetRate());
        IAccountantImpl.CalculateCurrentMonthSalary(accountant1.GetWorkHours(), accountant1.GetRate());
        IAccountantImpl.CalculateCurrentMonthSalary(manager1.GetWorkHours(), manager1.GetRate());

        System.out.println("name -> "  + manager2.GetName() +   "    workHours -> " + manager2.GetWorkHours() + "    rate -> " + manager2.GetRate() + "    salary -> " + IAccountantImpl.CalculateCurrentMonthSalary(manager2.GetWorkHours(), manager2.GetRate()));

        System.out.println("name -> " + programmer2.GetName()+  "    workHours -> " + programmer2.GetWorkHours() + "    rate -> " + programmer2.GetRate() + "    salary -> " + IAccountantImpl.CalculateCurrentMonthSalary(programmer2.GetWorkHours(), programmer2.GetRate()));
    }
}
