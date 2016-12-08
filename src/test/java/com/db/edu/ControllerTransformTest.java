package com.db.edu;

import com.db.edu.etl.Controller;
import com.db.edu.etl.DTO;
import com.db.edu.etl.RecordType;
import org.junit.Test;

import static com.db.edu.etl.Controller.transform;
import static org.junit.Assert.assertEquals;

public class ControllerTransformTest {
    @Test
    public void shouldGetTransformedDataAndAverageWhenNonEmptyArray() {
        final DTO transformResult = transform(
               RecordType.EIS1_DATA_FILE,
               new String[] {"10", "20"}
        );

        assertEquals(15.0, transformResult.getAverage(), 0.01);
    }
    @Test
    public void shouldNotCrashWhenEmptyArray() {
        String[] rawDataRecord = null;

                final DTO transformResult = transform(
                RecordType.EIS1_DATA_FILE,
                rawDataRecord
        );

        assertEquals(0.0, transformResult.getAverage(), 0.01);
    }
}

