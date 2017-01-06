package school.lemon.changerequest.java;

/**
 * Created by Diana on 06.01.2017.
 */
public class Programmer extends IAccountantImpl {

    public Programmer(int workHours, int rate) {
        super(workHours, rate);
    }

    @Override
    public int GetWorkHours() {
        return super.GetWorkHours();
    }

    @Override
    public void SetWorkHours(int workHours) {
        super.SetWorkHours(workHours);
    }

    @Override
    public int GetRate() {
        return super.GetRate();
    }

    @Override
    public void SetRate(int rate) {
        super.SetRate(rate);
    }


}
