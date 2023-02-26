public class Addition extends Expression{

    private Expression numberOne;
    private Expression numberTwo;


    public Addition (Expression numberOne,Expression numberTwo){
       this.numberOne = numberOne;
       this.numberTwo = numberTwo;

    }

    public Addition() {  }

    /**
     * returns the sum of the 2 given expressions
     * @return the sum of the 2 given expressions
     */
    @Override
    public double evaluate() {
        double firstAdded = numberOne.evaluate();
        double secondAdded=numberTwo.evaluate();
        double sum = firstAdded+secondAdded;
        return sum;

    }

    /**
     * returns concatenation of strings in the asked paradigm
     * @return concatenation of strings in the asked paradigm
     */
    @Override
    public String toString() {
        return "("+numberOne.toString()+" + "+numberTwo.toString()+")";


    }


}
