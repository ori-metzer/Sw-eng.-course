public class Subtraction extends Expression{

    private Expression numberOne;
    private Expression numberTwo;

    public Subtraction (Expression numberOne,Expression numberTwo){
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;

    }

    /**
     * Returns the subtraction of the 2 given expressions
     * @return the subtraction of the 2 given expressions
     */
    @Override
    public double evaluate() {
        double firstSubtracted = numberOne.evaluate();
        double secondSubtracted=numberTwo.evaluate();
        double subtractionValue = firstSubtracted-secondSubtracted;
        return subtractionValue;

    }

    /**
     * returns concatenation of strings in the asked paradigm
     * @return concatenation of strings in the asked paradigm
     */
    @Override
    public String toString() {
        return "("+numberOne.toString()+" - "+numberTwo.toString()+")";


    }


}
