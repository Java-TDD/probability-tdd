package com.example;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProbabilityTest {

    @Test
    public void toCheckTheEqualityWhenProbabilityOfGettingHeadIsComparedWithProbabilityOfGettingTail(){
        Probability probabilityOfHead = new Probability(0.5); //hashcode @24234234542
        Probability probabilityOfTail = new Probability(0.5); //hashcode @24234234542

        assertThat(probabilityOfHead, is(equalTo(probabilityOfTail)));
    }
}
