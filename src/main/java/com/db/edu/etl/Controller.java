package com.db.edu.etl;
import com.db.edu.EtlApp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Controller {

    private static final Logger Logger = LoggerFactory.getLogger(Controller.class);

    public static String[] transform(RecordType recordType, String rawDataRecord) {
        switch (recordType) {
            case EIS1_DATA_FILE: {
                return rawDataRecord.split(",");
            }
            case EIS2_DATA_FILE: {
                return rawDataRecord.split(";");
            }
            default:
                return null;
        }
    }

    public static String extract(RecordType recordType) {
        Logger.debug("Start extract");

        Logger.debug("End extract");

        return null;
     }

    public static void load (String[] transformedData) {
        Logger.debug("Start load with ars", transformedData);

        Logger.debug("End load");
    }

}