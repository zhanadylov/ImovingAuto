package com.imoving.UI;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Log4jDemo {

    private static Logger logger = (Logger) LogManager.getLogger(Log4jDemo.class);

    public static void main(String[] args) {
        logger.info("Info message!");
        logger.debug("Debug message");
        logger.trace("Trace message");
        logger.warn("Warn message");
        logger.error("Error message");
        logger.fatal("Fatal message");
    }
}
