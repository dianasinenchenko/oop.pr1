package school.lemon.changerequest.java;

/**
 * Created by Diana on 06.01.2017.
 */
public final class EmployeesCreate {
    public static IAccountant createAccountant(int workHours, int rate, String name) {
        IAccountantImpl accountant = new IAccountantImpl(workHours, rate, name);
        return accountant;
    }


    public static IAccountant createProgrammer(int workHours, int rate, String name) {
        Programmer programmer = new Programmer(workHours, rate, name);
        return programmer;
    }


    public static IAccountant createManager(int workHours, int rate, String name) {
        Manager manager = new Manager(workHours, rate, name);
        return manager;
    }
}