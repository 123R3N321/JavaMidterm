package PartII;
/**
 * note we don't process file yet, no need to import io
 * regex might go wrong. Careful!
 */

import java.util.regex.*;

abstract class LogProcessor {
    protected static final Pattern logPattern = Pattern.compile("(\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2},\\d{3}) (\\w+) \\[([^]]+)\\] (.+)");

    protected abstract void processLog(String inFile, String outFile);
}