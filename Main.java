import java.io.*;

// Program performs some sort of computation
// Takes a command-line argument saying where to write
// output to.  Either to a file or the terminal
public class Main {
    // takes command-line arguments
    // returns null if we are writing to the terminal,
    // otherwise gives us a filename
    public static String getDestinationFile(String[] args) { ... }

    public static void write(String destination, int toWrite) {
        if (destination == null) {
            System.out.println(toWrite);
        } else {
            BufferedWriter writer =
                new BufferedWriter(new FileWriter(new File(destination)));
            writer.write(toWrite);
            writer.close();
        }
    }
    
    public static int doComputation(String destination) {
        // ...do some work...
        int temporaryResult = 7;

        // ...status report
        write(destination, temporaryResult);
        
        // do some more work
        temporaryResult++;
        return temporaryResult;
    }   
    
    public static void main(String[] args) {
        String destination = getDestinationFile(args);
        int result = doComputation();
        write(destination, result);
    }
}
