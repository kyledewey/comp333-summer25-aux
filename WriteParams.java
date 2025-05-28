public class WriteParams {
    public final String destinationFile;
    public final String dbHandle;
    public final String networkHandle;

    public WriteParams(final String destinationFile,
                       final String dbHandle,
                       final String networkHandle) {
        this.destinationFile = destinationFile;
        this.dbHandle = dbHandle;
        this.networkHandle = networkHandle;
    }
}

