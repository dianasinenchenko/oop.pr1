package school.lemon.changerequest.java;

/**
 * Created by Diana on 06.01.2017.
 */
public final class EmployeesCreate {
    public static IAccountant createAccountant(int workHours, int rate) {
        IAccountantImpl accountant = new IAccountantImpl(workHours, rate);
        return accountant;
    }


    public static IAccountant createProgrammer(int workHours, int rate) {
        Programmer programmer = new Programmer(workHours, rate);
        return programmer;
    }


    public static IAccountant createManager(int workHours, int rate) {
        Manager manager = new Manager(workHours, rate);
        return manager;
    }
}