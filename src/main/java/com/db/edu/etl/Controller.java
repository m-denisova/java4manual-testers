package com.db.edu.etl;
import com.db.edu.EtlApp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Controller {

    private static final Logger Logger = LoggerFactory.getLogger(Controller.class);

    public static String[] transform(RecordType recordType, String[] rawDataRecord) {
        String[] transformed = null;

        for (String record : rawDataRecord) {

            switch (recordType) {
                case EIS1_DATA_FILE: {
                    // Logger.debug("Parsing EIS1_DATA_FILE");
                    return null;
                }
                case EIS2_DATA_FILE: {
                    //  Logger.debug("Parsing EIS2_DATA_FILE");
                    //transformed = record.split(",");
                    return null;
                }
                default:
                    return null;
            }

        }
                return transformed;
    }

    public static String[] extract(RecordType recordType) {
        Logger.debug("Start extract");

        Logger.debug("End extract");

        return null;
     }

    public static void load (String[] transformedData) {
        Logger.debug("Start load with ars", transformedData);

        Logger.debug("End load");
    }

}