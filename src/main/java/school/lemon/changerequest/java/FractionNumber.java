package school.lemon.changerequest.java;

/**
 * Created by Diana on 05.01.2017.
 */
public class FractionNumber {
    private int dividend;
    private int divisor;

    public FractionNumber(int dividend, int divisor) {
        if (divisor == 0) throw new ArithmeticException("You divisor is 0, incorrect value");
        if (dividend == 0) {
            this.dividend = dividend;
            this.divisor = 1;
        }
        this.dividend = dividend;
        this.divisor = divisor;
        int GreatestCommonDivisor = GreatestCommonDivisor(this.dividend, this.divisor);
        this.dividend = dividend / GreatestCommonDivisor;
        this.divisor = divisor / GreatestCommonDivisor;
    }

    public int GreatestCommonDivisor(int dividend, int divisor) {
        return divisor == 0 ? dividend : GreatestCommonDivisor(divisor, dividend % divisor);
    }

    public FractionNumber(int dividend) {
        this.dividend = dividend;
        this.divisor = 1;
    }

    public int GetDividend() {
        return dividend;
    }

    public int GetDivisor() {
        return divisor;
    }

    public double GetDecimalValue() {
        return (double) dividend / (double) divisor;
    }

    public String ToString() {
        return String.format("%1$d/%2$d", dividend, divisor);
    }

    public FractionNumber AddAnotherFractionNumber(FractionNumber anotherFractionNumber) {
        int anotherDividend;
        int anotherDivisor;
        if (divisor == anotherFractionNumber.divisor) {
            anotherDividend = divisor + anotherFractionNumber.dividend;
            anotherDivisor = divisor;
        } else {
            anotherDivisor = anotherFractionNumber.divisor * divisor;
            anotherDividend = anotherFractionNumber.dividend * divisor + dividend * anotherFractionNumber.divisor;
        }
        return new FractionNumber(anotherDividend, anotherDivisor);
    }

    public FractionNumber SubtractAnotherFractionNumber(FractionNumber anotherFractionNumber) {
        int anotherDividend;
        int anotherDivisor;
        if (divisor == anotherFractionNumber.divisor) {
            anotherDividend = divisor - anotherFractionNumber.dividend;
            anotherDivisor = divisor;
        } else {
            anotherDivisor = anotherFractionNumber.divisor * divisor;
            anotherDividend = anotherFractionNumber.dividend * divisor - dividend * anotherFractionNumber.divisor;
        }
        return new FractionNumber(anotherDividend, anotherDivisor);
    }

    public FractionNumber MultiplyAnotherFractionNumber(FractionNumber anotherFractionNumber) {
        int anotherDividend;
        int anotherDivisor;
        anotherDivisor = anotherFractionNumber.divisor * divisor;
        anotherDividend = anotherFractionNumber.dividend * dividend;
        return new FractionNumber(anotherDividend, anotherDivisor);
    }

    public FractionNumber DivideAnotherFractionNumber(FractionNumber anotherFractionNumber) {
        int anotherDividend;
        int anotherDivisor;
        anotherDivisor = anotherFractionNumber.divisor * dividend;
        anotherDividend = anotherFractionNumber.dividend * divisor;
        return new FractionNumber(anotherDividend, anotherDivisor);
    }

    public final FractionNumber ONE = new FractionNumber(1, 1);
    public final FractionNumber ZERRo = new FractionNumber(0, 1);

}
