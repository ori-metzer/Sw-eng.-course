abstract class ExpressionParser {

    public abstract Expression parse(String strExpression);

    /**
     *
     * checks which kind of substring was given and if its double or int
     * we convert it to an expression and push it into the stack
     * @param subExp substring created based on spaces
     * @param stack the stack to push the given expression into
     */
    public void expressionDivider( String subExp, Stack stack) {

            Expression expToNode;
            if (!(subExp.equals("+") || subExp.equals("-") || subExp.equals("/") || subExp.equals("*") || subExp.equals("-u"))){
                boolean flag = true;
                for (int j = 0; j < subExp.length(); j++) {
                    if (subExp.charAt(j) == 46) { // if we found a dot
                        flag = false; // the number is float
                    }
                }

                if (flag) {
                    int number = Integer.parseInt(subExp);
                    expToNode = new IntegerLiteral(number);
                } else {
                    double number = Double.parseDouble(subExp);
                    expToNode = new DoubleLiteral(number);
                }
                stack.push(expToNode);
            }


        }
    }


