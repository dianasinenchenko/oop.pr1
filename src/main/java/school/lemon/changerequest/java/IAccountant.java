package school.lemon.changerequest.java;

/**
 * Created by Diana on 05.01.2017.
 */
public interface IAccountant extends Employees {

    @Override
    default int CalculateCurrentMonthSalary() {
        return 0;
    }

    @Override
    default int GetRatioOfWorkedHours() {
        return 0;
    }
}
