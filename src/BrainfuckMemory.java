import java.util.*;

public class BrainfuckMemory {
    private final byte tape[] = new byte[200];
    private int instructionPointer = 0;
    private final Map<Character, CommandParser> table = null;

    public BrainfuckMemory() {
        table.put('>', new GreaterThanCommandParser());
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
}

