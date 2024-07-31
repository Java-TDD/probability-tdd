package com.example;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class ProbabilityTest {

    @Test
    public void toCheckTheEqualityWhenProbabilityOfGettingHeadIsComparedWithProbabilityOfGettingTail(){
        Probability probabilityOfHead = new Probability(0.5); //hashcode @24234234542
        Probability probabilityOfTail = new Probability(0.5); //hashcode @24234234542

        assertThat(probabilityOfHead, is(equalTo(probabilityOfTail)));
    }

    @Test
    public void toCheckTheInequalityWhenProbabilityOfGettingHeadIsComparedWithProbabilityOfGettingOneInDice(){
        Probability probabilityOfHead = new Probability(0.5);
        Probability probabilityOfOneInDice = new Probability(0.16);

        assertThat(probabilityOfHead, is(not(equals(probabilityOfOneInDice))));
    }

    @Test
    public void toCheckWhetherTheProbabilityOfTwoCertainEventOccurringTogetherIsAlsoACertainEvent(){
        Probability certainEventProbability = new Probability(1);
        Probability anotherCertainEventProbability = new Probability(1);

        assertThat(certainEventProbability.and(anotherCertainEventProbability), is(equalTo(certainEventProbability)));
    }

}
