package PartII;
public class LogProcessorTest {
    public static void main(String[] args) {
        String inputFile = "Hadoop_2k.log"; //must be same level in directory!

        new WarnLogProcessor().processLog(inputFile, "warn_logs.txt");
        new ErrorLogProcessor().processLog(inputFile, "error_logs.txt");

        System.out.println("Processing completed.");
    }
}
