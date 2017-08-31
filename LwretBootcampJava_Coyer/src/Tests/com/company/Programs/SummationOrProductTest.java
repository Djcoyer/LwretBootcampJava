package com.company.Programs;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;

public class SummationOrProductTest {

    @Test
    public void GetOperation_ReturnsSameInputValue(){

        //arrange
        String input = "Product";
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));

        //act
        String operation = SummationOrProduct.GetOperation();

        //assert
        Assert.assertEquals("Should match input because it was a valid choice",input, operation);
    }

    @Test
    public void SumOrProductFrom1ToN_Returns120WhenInput5(){
        //arrange
        int input = 5;
        String operation = "product";
        String expected = "120";

        //act
        String result = SummationOrProduct.SumOrProductFrom1ToN(input, operation);

        //assert
        Assert.assertThat("5 factorial should return 120", result, containsString(expected));
    }

}