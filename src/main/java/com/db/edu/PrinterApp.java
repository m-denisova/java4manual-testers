package com.db.edu;

import com.db.edu.etl.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrinterApp {
    private static final Logger logger = LoggerFactory.getLogger(PrinterApp.class);
        private PrinterApp() {}

    public static void main(String... args) {
        logger.debug("Entering main method with args {}", args);

        System.out.println(Controller.transform());
        // System.out.println( "Hello World!" );
       // System.out.println( "Hello World!" );
    }

}
