public class BrainfuckContext {
    private char[] sourceCode;

    public BrainfuckContext(char[] codes) {
        this.sourceCode = codes;
    }

    public char[] getSourceCode() {
        return sourceCode;
    }

}
