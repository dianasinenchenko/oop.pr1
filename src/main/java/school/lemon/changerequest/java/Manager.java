package school.lemon.changerequest.java;

/**
 * Created by Diana on 06.01.2017.
 */
public class Manager extends IAccountantImpl {
    private int workHoursManager;
    private int rateManager;

    public Manager(int workHours, int rate) {
        super(workHours, rate);
        this.workHoursManager = workHours;
        this.rateManager = rate;
    }

    @Override
    public int GetWorkHours() {
        return workHoursManager;
    }

    @Override
    public void SetWorkHours(int workHours) {
        this.workHoursManager = workHours;
    }

    @Override
    public int GetRate() {
        return rateManager;
    }

    @Override
    public void SetRate(int rate) {
        this.rateManager = rate;
    }


}
