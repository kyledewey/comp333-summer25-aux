public class WriteToNetwork extends WriteParams {
    public final String networkHandle;
    private NetworkHandle networkWriter = null;

    public WriteToNetwork(final String networkHandle) {
        this.networkHandle = networkHandle;
    }
    public void write(int toWrite) {
        if (networkWriter == null) {
            networkWriter = new NetworkHandle(networkHandle);
        }
        networkWriter.writeToNetwork(toWrite);
    }
    public void close() {
        if (networkWriter != null) {
            networkWriter.close();
        }
    }
}

