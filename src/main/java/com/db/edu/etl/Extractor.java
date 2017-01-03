package com.db.edu.etl;

/**
 * Created by админ on 03.01.2017.
 */
public interface Extractor {
    String[] extract(RecordType recordType);
}
