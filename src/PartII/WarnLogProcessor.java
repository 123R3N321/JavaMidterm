package PartII;
/**
 * DO NOT MODIFY THIS FILE
 */

import static PartII.LogProcessorUtil.processLogWithSeverity;

class WarnLogProcessor extends LogProcessor {
    @Override
    public void processLog(String inFile, String outFile) {
        processLogWithSeverity(inFile, outFile, "WARN");
    }
}