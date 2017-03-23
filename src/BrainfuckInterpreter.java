public class BrainfuckInterpreter {
    private static BrainfuckContext brainfuckContext;
    private static BrainfuckMemory memory;

    public static void main(String[] args) {

        char[] codes = readSourceCode("source_code.txt");
        brainfuckContext = new BrainfuckContext(codes);
        memory = new BrainfuckMemory();
        interprete();

    }

    private static void interprete() {
        while(memory.getInstructionPointer() > brainfuckContext.getSourceCode().length){
            char code = brainfuckContext.getSourceCode()[memory.getInstructionPointer()];
            memory.getTable().get(code).parse(memory);
            memory.setInstructionPointer(memory.getInstructionPointer() +1);
        }
        System.out.println(memory.getOutput());
    }

    private static char[] readSourceCode(String filePath) {
        String sourcecode = ">";
        return sourcecode.toCharArray();
    }
}
