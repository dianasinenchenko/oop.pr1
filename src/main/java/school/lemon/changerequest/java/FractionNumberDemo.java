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
        System.out.println("dividend is 9 and divisor is 9 = " + fractionNumber2.ToString());
        System.out.println("dividend is 9 and divisor is 3 = " + fractionNumber3.ToString());
        System.out.println("dividend is 9 and divisor is -3 = " + fractionNumber4.ToString());
        System.out.println("dividend is -9 and divisor is -3 = " + fractionNumber5.ToString());
        System.out.println("dividend is -9 and divisor is 3 = " + fractionNumber6.ToString());
        System.out.println("dividend is 0 and divisor is 3 = " + fractionNumber7.ToString());
        System.out.println("add "+fractionNumber1.ToString() +" and "+ fractionNumber2.ToString() + " is "+ fractionNumber1.AddAnotherFractionNumber(fractionNumber2).ToString());
        System.out.println("subtract "+fractionNumber1.ToString() +" and "+ fractionNumber2.ToString() + " is "+ fractionNumber1.SubtractAnotherFractionNumber(fractionNumber2).ToString());
        System.out.println("multiply "+fractionNumber1.ToString() +" and "+ fractionNumber2.ToString() + " is "+ fractionNumber1.MultiplyAnotherFractionNumber(fractionNumber2).ToString());
        System.out.println("divide "+fractionNumber1.ToString() +" and "+ fractionNumber2.ToString() + " is "+ fractionNumber1.DivideAnotherFractionNumber(fractionNumber2).ToString());
        System.out.println("ONE "+ FractionNumber.ONE.ToString());
        System.out.println("ZERRO "+ FractionNumber.ZERRo.ToString());
    }
}
