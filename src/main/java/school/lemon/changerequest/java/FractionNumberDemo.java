package school.lemon.changerequest.java;

/**
 * Created by Diana on 05.01.2017.
 */
public class FractionNumberDemo {
    public static void main(String[] args) {
        FractionNumber fractionNumber1 = new FractionNumber(3, 9);
        FractionNumber fractionNumber2 = new FractionNumber(9, 9);
        FractionNumber fractionNumber3 = new FractionNumber(9, 3);
        FractionNumber fractionNumber4 = new FractionNumber(9, -3);
        FractionNumber fractionNumber5 = new FractionNumber(-9, -3);
        FractionNumber fractionNumber6 = new FractionNumber(-9, 3);
        FractionNumber fractionNumber7 = new FractionNumber(0, 3);
        System.out.println("dividend is 3 and divisor is 9 = " + fractionNumber1.ToString());

    }
}
