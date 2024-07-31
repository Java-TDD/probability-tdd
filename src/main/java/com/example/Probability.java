package com.example;

import java.util.Objects;

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
        if(object == null){
            return false;
        }
        if(this.getClass() != object.getClass()){
            return false;
        }
        if(this.probabilityValue == ((Probability) object).probabilityValue){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Double.valueOf(probabilityValue).hashCode();
    }
}
