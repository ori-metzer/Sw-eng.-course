public class RoundedExpression extends Expression{
    private Expression number;
    private int roundScale;
    public RoundedExpression(Expression number, int roundScale){
        this.number = number;
        this.roundScale = roundScale;
    }

    /**
     * Returns the given expression rounded by a number of digits mentioned in the constructor
     * @return the given expression rounded by a number of digits mentioned in the constructor (roundScale)
     */
    @Override
    public double evaluate() {
        double powerTen = Math.pow(10,roundScale);
        double largedNumber = number.evaluate()*(powerTen); //first we shift right the floating point by the given scale
        long roundLargeNumber = Math.round(largedNumber); //round the incremented number in order to round the last digit
        double roundedNumber = roundLargeNumber/powerTen;
        return roundedNumber;

    }

    /**
     * Returns concatenation of strings in the asked paradigm
     * @return concatenation of strings in the asked paradigm
     */
    @Override
    public String toString() {
        return number.toString();
    }
}
