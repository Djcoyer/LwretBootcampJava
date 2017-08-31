package com.company.Programs;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class SummationTest {

    @Test
    public void SumFrom1ToN_Returns55WhenNIs10(){
        //arrange
        int n = 10;
        String expected = "55";

        //act
        String message = Summation.SumFrom1ToN(n);

        //assert
        assertThat("Message should return the answer of 55", message, containsString(expected));
    }

}