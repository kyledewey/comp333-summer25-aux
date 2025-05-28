public class WriteToDatabase extends WriteParams {
    public final String dbHandle;
    private DatabaseHandle databaseWriter = null;

    public WriteToDatabase(final String dbHandle) {
        this.dbHandle = dbHandle;
    }
    public void write(int thingToWrite) {
        if (databaseWriter == null) {
            databaseWriter = new DatabaseHandle(dbHandle);
        }
        databaseWriter.writeToDatabase(toWrite);
    }

    public void close() {
        if (databaseWriter != null) {
            databaseWriter.close();
        }
    }
}

