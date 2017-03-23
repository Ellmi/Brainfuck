import java.util.*;

public class BrainfuckMemory {
    private final byte tape[] = new byte[200];
    private int instructionPointer = 0;
    private String output = "";
    private int head = 0;
    private final Map<Character, CommandParser> table = new HashMap<Character, CommandParser>();

    public BrainfuckMemory() {
        table.put('>', new GreaterThanCommandParser());
        table.put('<', new LesserThanCommandParser());
        table.put('+', new PlusCommandParser());
        table.put('-', new MinusCommandParser());
        table.put('.', new DotCommandParser());
    }

    public Map<Character, CommandParser> getTable() {
        return table;
    }

    public int getInstructionPointer() {
        return instructionPointer;
    }

    public void setInstructionPointer(int instructionPointer) {
        this.instructionPointer = instructionPointer;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public byte[] getTape() {
        return tape;
    }
}

