public class PolishNotationParser extends ExpressionParser {

    /**
     * Returns the given expression after it was converted from a string
     * @param strExpression string represents expression in a polish notation
     * @return the given expression after it was converted from a string (using a stack peek)
     */
    @Override
    public Expression parse(String strExpression) {
        Stack stack = new Stack();
        String subExp = "";
        if(strExpression.charAt(0)!=32){
            strExpression = " " + strExpression;
        }

        int spaceIdx = strExpression.length();

        for (int i = strExpression.length() - 1; i >= 0; i--) {
            if (strExpression.charAt(i) == 32) {
                subExp = strExpression.substring(i + 1, spaceIdx);
                expressionDivider(subExp, stack);
                spaceIdx = i;
            }
            if (strExpression.charAt(i) == 43) { // addition case
                Expression firstAdd = stack.pop();
                Expression secondAdd = stack.pop();
                Expression additionExp = new Addition(firstAdd, secondAdd);
                stack.push(additionExp); // pop 2 last items and push instead the new addition expression
            }
            if (strExpression.charAt(i) == 45 && (strExpression.charAt(i+1) == 32)) { // subtraction case
                Expression firstSub = stack.pop();
                Expression secondSub = stack.pop();
                Expression subtractionExp = new Subtraction(firstSub, secondSub);
                stack.push(subtractionExp); // pop 2 last items and push instead the new expression

            }
            if (strExpression.charAt(i) == 47) { // division case
                Expression firstDiv = stack.pop();
                Expression secondDiv = stack.pop();
                Expression divisionExp = new Division(firstDiv, secondDiv);
                stack.push(divisionExp); // pop 2 last items and push instead the new expression
            }
            if (strExpression.charAt(i) == 42) { // multiplication case
                Expression firstMulti = stack.pop();
                Expression secondMulti = stack.pop();
                Expression multiplicationExp = new Multiplication(firstMulti, secondMulti);
                stack.push(multiplicationExp); // pop 2 last items and push instead the new expression
            }
            if (subExp.equals("-u")) { // unary case
                Expression number = stack.pop();
                Expression unaryNumber = new UnaryMinus(number);
                stack.push(unaryNumber);
                subExp = "";
            }

        }
        return stack.peek();
    }
}