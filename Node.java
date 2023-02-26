public class Node {
    private Expression expression;
    private Node next;

    public Node(Expression expression, Node next){
        this.expression = expression;
        this.next = next;
    }

    public Node(Expression expression){ this(expression,null);}

    /**
     *
     * @return this function shows the expression of the node
     */
    public Expression getExpression(){ return expression;}

    /**
     * returns the next node
     * @return the next node
     */
    public Node getNext(){ return next;}

    /**
     * sets the expression in the node
     * @param expression expression to be set in the node
     */
    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    /**
     * set the next node
     * @param next node to be set next
     */
    public void setNext(Node next) {
        this.next = next;
    }
}

