public class WriteToTerminal implements WriteParams {
    public WriteToTerminal() {}
    public void write(int toWrite) {
        System.out.println(toWrite);
    }
    public void close() {}
}

