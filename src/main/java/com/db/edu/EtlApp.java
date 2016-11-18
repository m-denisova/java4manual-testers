package com.db.edu;

import com.db.edu.etl.Controller;
import com.db.edu.etl.RecordType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EtlApp {
    private static final Logger logger = LoggerFactory.getLogger(EtlApp.class);
        private EtlApp() {}

    public static void main(String... args) {
        logger.debug("Entering main method with args {}", args);

        Controller.load(
                Controller.transform(RecordType.EIS1_DATA_FILE,
                        Controller.extract(RecordType.EIS1_DATA_FILE)
                )
        );


     }

}
