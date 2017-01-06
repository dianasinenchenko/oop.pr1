package school.lemon.changerequest.java;

/**
 * Created by Diana on 05.01.2017.
 */
public class IAccountantImpl implements IAccountant {
    private int rate;
    private int workHours;
    private String name;


    public IAccountantImpl(int workHours, int rate, String name) {
        this.workHours = workHours;
        this.rate = rate;
        this.name = name;

    }


    @Override
    public int GetWorkHours() {
        return workHours;
    }


    @Override
    public void SetWorkHours(int workHours) {
        this.workHours = workHours;
    }

    @Override
    public int GetRate() {
        return rate;
    }


    @Override
    public void SetRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String GetName() {
        return name;
    }

    @Override
    public void SetName(String name) {
        this.name = name;
    }


    public static int CalculateCurrentMonthSalary(int workHours, int rate) {

        return (rate * workHours) / 160;
    }


    static int GetRatioOfWorkedHours() {
        return 0;
    }
}
