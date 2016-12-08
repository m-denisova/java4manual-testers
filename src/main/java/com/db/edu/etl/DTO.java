package com.db.edu.etl;

public class DTO {
     private int[] transformationResult;
     private double average;

     public DTO(int[] transformationResult, double average) {
        this.transformationResult = transformationResult;
        this.average = average;
     }

     public int[] getTransformationResult() {
         return transformationResult;
     }

     public double getAverage() {
         return average;
     }
}
