package com.example;


public class Probability {

    double probabilityValue;

    public Probability(double probabilityValue) {
        this.probabilityValue = probabilityValue;
    }

    @Override
    public boolean equals(Object object) {
        if(this == object){
            return true;
        }
        if(object == null || this.getClass() != object.getClass()){
            return false;
        }
        return this.probabilityValue == ((Probability) object).probabilityValue;
    }

    @Override
    public int hashCode() {
        return Double.valueOf(probabilityValue).hashCode();
    }
}
