import java.io.*;

// Program performs some sort of computation
// Takes a command-line argument saying where to write
// output to.  Can write to:
// - The terminal
// - A file
// - A database
// - A network location
public class Main {    
    // takes command-line arguments
    // returns null if we are writing to the terminal,
    // otherwise gives us a filename
    public static String getDestinationFile(String[] args) { ... }

    // returns null if not writing to a database
    public static String getDatabaseHandle(String[] args) { ... }

    // returns null if not writing to a network
    public static String getNetworkHandle(String[] args) { ... }
    
    public static int doComputation(WriteParams params) {
        // ...do some work...
        int temporaryResult = 7;

        // ...status report
        params.write(temporaryResult);
        
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
        params.write(result);
        params.close();
    }
}
