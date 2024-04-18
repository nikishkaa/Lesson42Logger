package by.itstep.goutor.javalesson.lesson42;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger LOGGER;

    static {
        LOGGER = Logger.getRootLogger();
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();
        LOGGER.setLevel(Level.ERROR);

        LOGGER.trace("call trace method...");
        LOGGER.debug("call debug method...");
        LOGGER.info("call info method...");
        LOGGER.warn("call warn method...");
        LOGGER.error("call error method...");
        LOGGER.fatal("call fatal method...");

    }
}
