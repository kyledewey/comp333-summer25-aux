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

        WriteParams params;

        if (destinationFile != null) {
            // WriteParams = WriteToFile
            // subtyping polymorphism: a more specific type can be used
            // in place when we want a general one (compile-time thing)
            params = new WriteToFile(destinationFile);
        } else if (dbHandle != null) {
            // WriteParams = WriteToDatabase
            params = new WriteToDatabase(dbHandle);
        } else if (networkHandle != null) {
            // WriteParams = WriteToNetwork
            params = new WriteToNetwork(networkHandle);
        } else {
            // WriteParams = WriteToTerminal
            params = new WriteToTerminal();
        }

        int result = doComputation(params);

        // runtime type used to determine which method to call: ad-hoc polymorphism (runtime feature)
        params.write(result);
        params.close();
    }
}
