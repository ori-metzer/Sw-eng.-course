public class Stack {
    private Node head;

    public Stack() {
        head = null;
    }

    /**
     * pushes a given expression into the stack as a node
     * @param exp given expression to push into the stack as a node
     */
    public void push(Expression exp) {
        Node newHead = new Node(exp);
        newHead.setNext(head);
        head = newHead;
    }

    /**
     * returns the expression which is at the head of the stack (and removing it from the stack) or null if the stack is empty
     * @return the expression which is at the head of the stack (and removing it from the stack) or null if the stack is empty
     */
    public Expression pop() {
        if (head == null) {
            return null;
        }
        Expression exp = head.getExpression();
        head = head.getNext();
        return exp;

    }

    /**
     * returns the expression which is at the head of the stack or null if the stack is empty
     * @return the expression which is at the head of the stack or null if the stack is empty
     */
    public Expression peek() {
        if (head == null) {
            return null;
        }
        return head.getExpression();
    }

    /**
     * Returns true if the stack is empty
     * @return true if the stack is empty
     */
    public boolean isEmpty() {
        return head == null;
    }


}