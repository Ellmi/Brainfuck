public class GreaterThanCommandParser implements CommandParser {
    @Override
    public void parse( BrainfuckMemory memory) {
        memory.setHead(memory.getHead() + 1);
    }
}
