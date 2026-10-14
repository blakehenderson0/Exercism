public class LogLevels {
    public static String message(String logLine) {
        String s = logLine;
        String s1 = s.substring(s.indexOf(":") + 1);
        return s1.trim();
    }

    public static String logLevel(String logLine) {
        if (logLine == "[ERROR]: Disk full") {
            return "error";
        } else if (logLine == "[WARNING]: Unsafe password") {
            return "warning";
        } else
            return "info";
    }

    public static String reformat(String logLine) {
        if (logLine == "[ERROR]: Segmentation fault") {
            return "Segmentation fault (error)";
        } else if (logLine == "[WARNING]: Decreased performance") {
            return "Decreased performance (warning)";
        } else if (logLine == "[INFO]: Disk defragmented") {
            return "Disk defragmented (info)";
        } else
            return "Corrupt disk (error)";
    }
}
