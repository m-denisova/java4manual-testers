package com.db.edu;
import static org.junit.Assert.assertEquals;

import com.db.edu.etl.Controller;
import com.db.edu.etl.RecordType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

//TODO Refactor to OOP testable design.
public class ControllerTest {
    private RecordType recordType;
    private int[] rawDataRecord;

       @Test
    public void shouldTransformWhenNull() {
           //region Given
           recordType = RecordType.EIS1_DATA_FILE;
           rawDataRecord = null;
           //enregion

           //region When
           Controller sut = new Controller();
           //regionend

           //region Then
           // if (size !=
           assertEquals(rawDataRecord, sut.transform(recordType, rawDataRecord));
           //regionadd
    }

    @Test
    public void shouldTransformWhenEmpty() {
        //region Given
        recordType = RecordType.EIS1_DATA_FILE;
        rawDataRecord = new int[] {};
        //enregion

        //region When
        Controller sut = new Controller();
        //regionend

        //region Then
        // if (size !=
        assertEquals(rawDataRecord, sut.transform(recordType, rawDataRecord));
        //regionadd
     }

    @Before

    @Test
    public void shouldTransformWhenData() {
        //region Given
        recordType = RecordType.EIS1_DATA_FILE;
        rawDataRecord = new int[] {1,1};
        //enregion

        //region When
        Controller sut = new Controller();
        //regionend

        //region Then
        // if (size !=
        assertEquals(rawDataRecord, sut.transform(recordType, rawDataRecord));
        //regionadd
    }
}
