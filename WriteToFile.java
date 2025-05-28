public class WriteToFile extends WriteParams {
    public final String destinationFile;
    private BufferedWriter fileWriter = null;

    public WriteToFile(final String destinationFile) {
        this.destinationFile = destinationFile;
    }
    public void write(int toWrite) {
        if (fileWriter == null) {
            fileWriter = new BufferedWriter(new FileWriter(new File(destinationFile)));
        }
        fileWriter.write(toWrite);
    }
    public void close() {
        if (fileWriter != null) {
            fileWriter.close();
        }
    }
}
