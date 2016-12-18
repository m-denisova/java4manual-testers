package com.db.edu.etl;

/**
 * Created by админ on 18.12.2016.
 */
public interface Transformer {
    DTO transform (String[] rawDataRecord);
}
