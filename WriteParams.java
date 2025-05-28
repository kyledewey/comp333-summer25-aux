public class WriteParams {
    public final String destinationFile;
    public final String dbHandle;
    public final String networkHandle;

    private BufferedWriter fileWriter = null;
    private DatabaseHandle databaseWriter = null;
    private NetworkHandle networkWriter = null;

    public WriteParams(final String destinationFile,
                       final String dbHandle,
                       final String networkHandle) {
        this.destinationFile = destinationFile;
        this.dbHandle = dbHandle;
        this.networkHandle = networkHandle;
    }

    public void write(int toWrite) {
        if (destinationFile != null) {
            if (fileWriter == null) {
                fileWriter = new BufferedWriter(new FileWriter(new File(destinationFile)));
            }
            fileWriter.write(toWrite);
        } else if (dbHandle != null) {
            if (databaseWriter == null) {
                databaseWriter = new DatabaseHandle(dbHandle);
            }
            databaseWriter.writeToDatabase(toWrite);
        } else if (networkHandle != null) {
            if (networkWriter == null) {
                networkWriter = new NetworkHandle(networkHandle);
            }
            networkWriter.writeToNetwork(toWrite);
        } else {
            System.out.println(toWrite);
        }
    }

    public void close() {
        if (fileWriter != null) {
            fileWriter.close();
        }
        if (databaseWriter != null) {
            databaseWriter.close();
        }
        if (networkWriter != null) {
            networkWriter.close();
        }
    }
}

