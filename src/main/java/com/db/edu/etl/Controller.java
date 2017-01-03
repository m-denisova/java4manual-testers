package com.db.edu.etl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Controller {
    public Transformer transformer;
    public Loader loader;
    public Extractor extractor;

    public Controller(Transformer transformer) {
        this.transformer = transformer;
    }
    private static final Logger Logger = LoggerFactory.getLogger(Controller.class);
    /* Comment out old transform versions
    public static String[] transform_old(RecordType recordType, String[] rawDataRecord) {
        String[] transformed = null;

        if (rawDataRecord == null) {
            Logger.debug("Empty rawDataRecord");
            return null;
        }
        else {
            for (String record : rawDataRecord) {
                if ((record == null) || (record == "")) {
                    continue;
                }
               switch (recordType) {
                    case EIS1_DATA_FILE: {
                        Logger.debug("Parsing EIS1_DATA_FILE");
                        return null;
                    }
                    case EIS2_DATA_FILE: {
                        //Logger.debug("Parsing EIS2_DATA_FILE");
                        //transformed = record.split(",");
                        return null;
                    }
                    default:
                        return null;
                }
            }
            return transformed;
        }
    }

    public static int[] transform(RecordType recordType, int[] rawDataRecord) {
       int sum = 0;
       float averageSalary = 0;

       if ((rawDataRecord != null) && (rawDataRecord.length > 0)) {
           for ( int counter =0 ; counter < rawDataRecord.length; counter++) {
               sum += rawDataRecord[counter];
           }
           averageSalary = (float) sum / rawDataRecord.length;
           Logger.info("Average Salary is " + String.format("%6.2f", averageSalary) );
       } else {
           Logger.info("rawDataRecord is null or has 0 lenght");
       }
       return rawDataRecord;
    }

    public String[] extract(RecordType recordType) {
        Logger.debug("Start extract");
        Logger.debug("End extract");
        return null;
     }

    public void load (String[] transformedData) {
        Logger.debug("Start load with ars", transformedData);
        Logger.debug("End load");
    }
    */
}