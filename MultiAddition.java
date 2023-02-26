
public class MultiAddition extends Addition{

    private Expression[] multiAdded;
    private int length;

    /**
     *
     * @param numbers all expressions added , if we get less than 2 parameters we will get runtime error
     */
    public MultiAddition(Expression... numbers){
        super();
        length = numbers.length;
        multiAdded = new Expression[numbers.length];
        for(int i = 0; i < length; i++){
            multiAdded[i] = numbers[i];
        }

    }

    /**
     * returns the sum of the given expressions
     * @return the sum of the given expressions
     */
    @Override
    public double evaluate() {
        double sum = new Addition(multiAdded[0],multiAdded[1]).evaluate();
        if (length%2==0){
            for (int i = 2; i < length-1; i=i+2){ // each iteration we add 2 items value by insert them to object of type addition
                double tempSum = new Addition (multiAdded[i],multiAdded[i+1]).evaluate();
                sum = sum+tempSum;
            }
        }
        else {
            for (int i = 2; i < length-1; i=i+2){ // if the number of items is odd then the last item will be added solely
                double tempSum = new Addition (multiAdded[i],multiAdded[i+1]).evaluate();
                sum = sum+tempSum;
            }
            sum = sum+multiAdded[length-1].evaluate();
        }
        return sum;
    }

    /**
     * returns concatenation of strings in the asked paradigm
     * @return concatenation of strings in the asked paradigm
     */
    @Override
    public String toString() {
        StringBuilder exp = new StringBuilder("(");
        for (int i = 0; i < length-1; i++){
            exp.append(multiAdded[i].toString());
            exp.append(" + ");
        }
        exp.append(multiAdded[length-1].toString()+")");
        String strExp = String.valueOf(exp);
        return strExp;
    }

}
