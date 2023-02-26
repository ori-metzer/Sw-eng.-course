public class Multiplication extends Expression{

    private Expression numberOne;
    private Expression numberTwo;

    public Multiplication (Expression numberOne,Expression numberTwo){
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;

    }

    public Multiplication(){ }

    /**
     * returns the multiplication result of two given expressions
     * @return the multiplication result of two given expressions
     */
    @Override
    public double evaluate() {
        double firstMulti = numberOne.evaluate();
        double secondMulti = numberTwo.evaluate();
        double multiResult = firstMulti*secondMulti;
        return multiResult;

    }

    /**
     * returns concatenation of strings in the asked paradigm
     * @return concatenation of strings in the asked paradigm
     */
    @Override
    public String toString() {
        return "("+numberOne.toString()+" * "+numberTwo.toString()+")";

    }

}
