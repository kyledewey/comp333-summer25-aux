import java.io.*;

// Program performs some sort of computation
// Takes a command-line argument saying where to write
// output to.  Either to a file or the terminal
public class Main {
    // takes command-line arguments
    // returns null if we are writing to the terminal,
    // otherwise gives us a filename
    public static String getDestinationFile(String[] args) { ... }

    public static int doComputation() { ... }
    
    public static void main(String[] args) {
        String destination = getDestinationFile(args);
        int result = doComputation();
        if (destination == null) {
            System.out.println(result);
        } else {
            BufferedWriter writer =
                new BufferedWriter(new FileWriter(new File(destination)));
            writer.write(result);
            writer.close();
        }
    }
}
