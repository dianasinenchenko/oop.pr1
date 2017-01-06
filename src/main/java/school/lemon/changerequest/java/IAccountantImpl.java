package school.lemon.changerequest.java;

/**
 * Created by Diana on 05.01.2017.
 */
public class IAccountantImpl implements IAccountant {
    private int workHoursAccountant;
    private int rateAccountant;

    public IAccountantImpl(int workHours, int rate) {
        this.workHoursAccountant = workHours;
        this.rateAccountant = rate;
    }

    @Override
    public int CalculateCurrentMonthSalary() {
        return 0;
    }

    @Override
    public int GetRatioOfWorkedHours() {
        return 0;
    }

    @Override
    public int GetWorkHours() {
        return workHoursAccountant;
    }


    @Override
    public void SetWorkHours(int workHours) {
        this.workHoursAccountant = workHours;
    }

    @Override
    public int GetRate() {
        return rateAccountant;
    }


    @Override
    public void SetRate(int rate) {
        this.rateAccountant = rate;
    }
}
