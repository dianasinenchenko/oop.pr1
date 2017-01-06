package school.lemon.changerequest.java;

/**
 * Created by Diana on 06.01.2017.
 */
public class Programmer extends IAccountantImpl {
    private int workHoursProgrammer;
    private int rateProgrammer;

    public Programmer(int workHours, int rate) {
        super(workHours, rate);
        this.workHoursProgrammer = workHours;
        this.rateProgrammer = rate;
    }

    @Override
    public int GetWorkHours() {
        return workHoursProgrammer;
    }

    @Override
    public void SetWorkHours(int workHours) {
        this.workHoursProgrammer = workHours;
    }

    @Override
    public int GetRate() {
        return rateProgrammer;
    }

    @Override
    public void SetRate(int rate) {
        this.rateProgrammer = rate;
    }


}
