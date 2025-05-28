import java.io.*;

// Program performs some sort of computation
// Takes a command-line argument saying where to write
// output to.  Can write to:
// - The terminal
// - A file
// - A database
// - A network location
public class Main {
    private static BufferedWriter fileWriter = null;
    private static DatabaseHandle databaseWriter = null;
    private static NetworkHandle networkWriter = null;
    
    // takes command-line arguments
    // returns null if we are writing to the terminal,
    // otherwise gives us a filename
    public static String getDestinationFile(String[] args) { ... }

    // returns null if not writing to a database
    public static String getDatabaseHandle(String[] args) { ... }

    // returns null if not writing to a network
    public static String getNetworkHandle(String[] args) { ... }

    public static void write(WriteParams params,
                             int toWrite) {
        if (params.destinationFile != null) {
            if (fileWriter == null) {
                fileWriter = new BufferedWriter(new FileWriter(new File(params.destinationFile)));
            }
            fileWriter.write(toWrite);
        } else if (params.dbHandle != null) {
            if (databaseWriter == null) {
                databaseWriter = new DatabaseHandle(params.dbHandle);
            }
            databaseWriter.writeToDatabase(toWrite);
        } else if (params.networkHandle != null) {
            if (networkWriter == null) {
                networkWriter = new NetworkHandle(params.networkHandle);
            }
            networkWriter.writeToNetwork(toWrite);
        } else {
            System.out.println(toWrite);
        }
    }
    
    public static int doComputation(WriteParams params) {
        // ...do some work...
        int temporaryResult = 7;

        // ...status report
        write(params, temporaryResult);
        
        // do some more work
        temporaryResult++;
        return temporaryResult;
    }   
    
    public static void main(String[] args) {
        String destinationFile = getDestinationFile(args);
        String dbHandle = getDatabaseHandle(args);
        String networkHandle = getNetworkHandle(args);

        WriteParams params = new WriteParams(destinationFile,
                                             dbHandle,
                                             networkHandle);
        int result = doComputation(params);
        write(params, result);

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
