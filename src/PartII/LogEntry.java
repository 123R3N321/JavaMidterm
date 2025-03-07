package PartII;
/*
I didn't nest this class because, easier to debug
 */
import java.util.Date; //This has Date type, which is convenient
import java.text.ParseException;    //not necessary but good for debug
import java.text.SimpleDateFormat;
class LogEntry {
    private Date date;
    private String severity;
    private String module;
    private String message;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS");

    public LogEntry(String dateStr, String severity, String module, String message) throws ParseException {
        this.date = dateFormat.parse(dateStr);
        this.severity = severity;
        this.module = module;
        this.message = message;
    }

    /**
     * Modify toString() to make result log more/less concise.
     * @return each entry you see in the result outfile.
     */
    @Override
    public String toString() {
        return dateFormat.format(date) + " " + severity + " [" + module + "] " + message;
    }
}