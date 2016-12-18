package com.db.edu;

import com.db.edu.etl.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ControllerTransformEIS1_DATA_FILETest {
    @Test
    public void shouldGetTransformedDataAndAverageWhenNonEmptyArray() {

        Controller sut = new Controller(new TransformerEIS1_DATA_FILE());
        final DTO transformResult = sut.transformer.transform
                (new String[] {"10", "20", "30"});
        assertEquals(20.0, transformResult.getAverage(), 0.01);
    }
    @Test
    public void shouldNotCrashWhenEmptyArray() {
        String[] rawDataRecord = null;
        Controller sut = new Controller(new TransformerEIS1_DATA_FILE());
        final DTO transformResult = sut.transformer.transform(
                rawDataRecord);

        assertEquals(0.0, transformResult.getAverage(), 0.1);
    }
}

