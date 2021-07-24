import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerExamples {
    private final static Logger log = Logger.getLogger(LoggerExamples.class.getName());

    public static void main(String[] args) {
        log.info("Hello");
        log.log(Level.FINE, "OK");
    }
}
