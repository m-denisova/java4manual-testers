package com.db.edu.etl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by админ on 18.12.2016.
 */
public class TransformerEIS1_DATA_FILE implements Transformer {
    private static final Logger Logger = LoggerFactory.getLogger(Transformer.class);

    @Override
    public DTO transform(String[] rawDataRecord) {
        int sum = 0;
        int counter = 0;
        double average = 0.;
        int[] transformationResults = null;

        if ((rawDataRecord == null) || (rawDataRecord.length == 0)) {
            Logger.debug("Empty or null raw data records");
        } else {
            transformationResults = new int [rawDataRecord.length];
            for (counter = 0; counter < rawDataRecord.length; counter++) {
                transformationResults[counter] = Integer.parseInt(rawDataRecord[counter]);
                sum += transformationResults[counter];
            }
            average = (double) sum / rawDataRecord.length;
        }

        return new DTO(
                transformationResults,
                average
        );
    }
}
