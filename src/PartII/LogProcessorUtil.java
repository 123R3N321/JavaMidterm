package PartII;

import java.io.*;
import java.text.ParseException;
import java.util.regex.*;

/**
 * This is the only module to be expnaded
 * for more extensive, verbose error logs
 * for now, just totoal WARN/ERROR/MSG count
 * potential extensions:
 *  -   time stamp range
 *  -   detail [..] repetitiveness count
 *  -   composition of msgs of diff severity
 */
class LogProcessorUtil {
    public static void processLogWithSeverity(String inFile, String outFile, String severity) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outFile))) {

            String line;
            int counter = 0;    //keep track how many we have
            while ((line = reader.readLine()) != null) {
                Matcher matcher = LogProcessor.logPattern.matcher(line);
                if (matcher.matches()) {    //first level parsing
                    String date = matcher.group(1);
                    String logSeverity = matcher.group(2);
                    String module = matcher.group(3);
                    String message = matcher.group(4);

                    if (logSeverity.equals(severity)) {
                        counter++;
                        LogEntry logEntry = new LogEntry(date, logSeverity, module, message);
                        writer.write(logEntry.toString());
                        writer.newLine();
                    }
                }
            }
            writer.newLine();
            writer.write("Logged "+ counter+" messages with " + severity);
            writer.flush(); //implicitly close opened file. flush() is also not strictly necessary
        } catch (IOException | ParseException e) {  //only asked to catch io exception, but this is tighter
            System.err.println("Error opening/parsing file: " + e.getMessage());
        }
    }
}