package com.db.edu;

import com.db.edu.etl.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ControllerTransformEIS1_DATA_FILETest {
    @Test
    public void shouldGetTransformedDataAndAverageWhenNonEmptyArray() {

        Controller sut = new Controller(new TransformerEIS1_DATA_FILE());
        sut.extractor = mock(Extractor.class);
        when(sut.extractor.extract(RecordType.EIS1_DATA_FILE)).thenReturn(new String[] {"10", "20", "30"});

        final DTO transformResult = sut.transformer.transform(
                sut.extractor.extract(RecordType.EIS1_DATA_FILE));
        assertEquals(20.0, transformResult.getAverage(), 0.01);
    }
    @Test
    public void shouldNotCrashWhenEmptyArray() {

        Controller sut = new Controller(new TransformerEIS1_DATA_FILE());
        sut.extractor = mock(Extractor.class);
        when(sut.extractor.extract(RecordType.EIS1_DATA_FILE)).thenReturn(new String[] {});

        final DTO transformResult = sut.transformer.transform(
                sut.extractor.extract(RecordType.EIS1_DATA_FILE));

        assertEquals(0.0, transformResult.getAverage(), 0.1);
    }
    @Test
    public void shouldNotCrashWhenGotNull() {

        Controller sut = new Controller(new TransformerEIS1_DATA_FILE());
        sut.extractor = mock(Extractor.class);
        when(sut.extractor.extract(RecordType.EIS1_DATA_FILE)).thenReturn(null);

        final DTO transformResult = sut.transformer.transform(
                sut.extractor.extract(RecordType.EIS1_DATA_FILE));

        assertEquals(0.0, transformResult.getAverage(), 0.1);
    }
}

