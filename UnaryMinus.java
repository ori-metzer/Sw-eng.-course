public class UnaryMinus extends Expression{

    private Expression number;

    public UnaryMinus (Expression number){
        this.number = number;
    }

    /**
     * Returns the minus value of the given expression
     * @return the minus value of the given expression
     */
    @Override
    public double evaluate() {
        double unaryNum = -1*(number.evaluate());

        return unaryNum;

    }

    /**
     * Returns concatenation of strings in the asked paradigm
     * @return concatenation of strings in the asked paradigm
     */
    @Override
    public String toString() {
        return "(-"+number+")";
    }
}
