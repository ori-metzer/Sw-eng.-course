public class Division extends Expression{


    private Expression numberOne;
    private Expression numberTwo;

    public Division (Expression numberOne,Expression numberTwo){
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;

    }

    /**
     * returns the division result of the 2 given expressions
     * @return the division result of the 2 given expressions
     */
    @Override
    public double evaluate() {
        double firstArg = numberOne.evaluate();
        double secondArg = numberTwo.evaluate();
        double devisionResult = firstArg/secondArg;
        return devisionResult;

    }

    /**
     * returns concatenation of strings in the asked paradigm
     * @return concatenation of strings in the asked paradigm
     */
    @Override
    public String toString() {
        return "("+numberOne.toString()+" / "+numberTwo.toString()+")";

    }

}
