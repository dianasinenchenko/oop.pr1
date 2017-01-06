package school.lemon.changerequest.java;

/**
 * Created by Diana on 05.01.2017.
 */
public interface IAccountant extends Employees {


    @Override
    default int GetWorkHours() {
        return 0;
    }

    @Override
    default void SetWorkHours(int workHours) {

    }

    @Override
    default int GetRate() {
        return 0;
    }

    @Override
    default void SetRate(int rate) {

    }

    @Override
    default String GetName() {
        return null;
    }

    @Override
    default void SetName(String name) {

    }


}
