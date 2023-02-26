public class MultiMultiplication extends Multiplication{

    private Expression[] multiMulti;
    private int length;

    /**
     *
     * @param numbers all expressions added , if we get less than 2 parameters we will get runtime error
     */
    public MultiMultiplication(Expression... numbers){
        super();
        length = numbers.length;
        multiMulti = new Expression[numbers.length];
        for(int i = 0; i < length; i++){
            multiMulti[i] = numbers[i];
        }

    }

    /**
     * returns the multiplication result of the given expressions
     * @return the multiplication result of the given expressions
     */
    @Override
    public double evaluate() {
        double res = new Multiplication(multiMulti[0],multiMulti[1]).evaluate();
        if (length%2==0){
            for (int i = 2; i < length-1; i=i+2){ // each iteration we multiply the res by 2 items' value by insert them to object of type multiplication
                double tempRes = new Multiplication (multiMulti[i],multiMulti[i+1]).evaluate();
                res = res*tempRes;
            }
        }
        else {
            for (int i = 2; i < length-1; i=i+2){ // if the number of items is odd then the last item will be multiplied solely
                double tempRes = new Addition (multiMulti[i],multiMulti[i+1]).evaluate();
                res = res*tempRes;
            }
            res = res*(multiMulti[length-1].evaluate());
        }
        return res;
    }


    /**
     * returns concatenation of strings in the asked paradigm
     * @return concatenation of strings in the asked paradigm
     */
    @Override
    public String toString() {

        StringBuilder exp = new StringBuilder("(");
        for (int i = 0; i < length-1; i++){
            exp.append(multiMulti[i].toString());
            exp.append(" * ");
        }
        exp.append(multiMulti[length-1].toString()+")");
        String strExp = String.valueOf(exp);
        return strExp;
    }


}


