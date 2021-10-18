import java.util.Stack;

public class SyntaxChecker {
    private String exp;
    private Stack<Character> symbols;

    /**
     * call setExpression with an empty String
     */
    public SyntaxChecker() {
        setExpression("");
    }

    /**
     * call setExpression with s
     */
    public SyntaxChecker(String s) {
        setExpression(s);
    }

    /**
     * initialize instance variables here
     */
    public void setExpression(String s) {
        exp = s;
        symbols = new Stack<>();
    }

    /**
     * open symbols should include { ( < [
     * close symbols should include } ) > ]
     * see assignment for algorithm help
     */
    public boolean checkExpression() {
        for (char chr : exp.toCharArray()) {
            if (chr == '{' || chr == '(' || chr == '<' || chr == '[') {
                symbols.push(chr);
            } else if (chr == '}' || chr == ')' || chr == '>' || chr == ']') {
                if (symbols.isEmpty()) return false;
                symbols.pop();
            }
        }

        return symbols.isEmpty();
    }

    @Override
    public String toString() {
        if (checkExpression()) {
            return exp + " is correct.";
        }
        return exp + " is incorrect.";
    }
}