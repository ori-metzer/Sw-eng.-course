public class IntegerLiteral extends Expression{

    private int intNumber;

    public IntegerLiteral (int intNumber){
        this.intNumber = intNumber;
    }


    @Override
    public double evaluate() {
        return intNumber;

    }

    /**
     * returns concatenation of strings in the asked paradigm
     * @return concatenation of strings in the asked paradigm
     */
    @Override
    public String toString() {

        return "("+intNumber+")";
    }



}
