public class DoubleLiteral extends Expression{

    private double doubleNumber;

    public DoubleLiteral(double doubleNumber){
        this.doubleNumber=doubleNumber;
    }


    @Override
    public double evaluate() {
        return doubleNumber;

    }

    /**
     * returns concatenation of strings in the asked paradigm
     * @return concatenation of strings in the asked paradigm
     */
    @Override
    public String toString() {
        return "("+doubleNumber+")";
    }





}
