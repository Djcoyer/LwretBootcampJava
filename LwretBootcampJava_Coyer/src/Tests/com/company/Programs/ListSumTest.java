package com.company.Programs;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;

public class ListSumTest {

    @Test
    public void GetList_ReturnsListOfNumbers(){
        //arrange
        String input = "1,4,5";
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));
        List<Integer> expected = Arrays.asList(1,4,5);

        //act
        List<Integer> result = ListSum.GetList();

        //assert
        Assert.assertEquals("", expected,result);

    }

    @Test
    public void GetOperation_ReturnsRecursionWhenInput(){
        //arrange
        String input = "recursion";
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));
        String expected = "recursion";

        //act
        String result = ListSum.GetOperation();

        //assert
        Assert.assertEquals(expected, result);
    }

    @Test
    public void SumListWithLoop_Returns10(){
        //arrange
        List<Integer> input = Arrays.asList(1,4,5);
        String expected = "10";

        //act
        String result = ListSum.SumListWithFor(input);

        //assert
        Assert.assertThat(result, containsString(expected));

    }

    @Test
    public void SumListWithWhile_Returns10(){
        //arrange
        List<Integer> input = Arrays.asList(1,4,5);
        String expected = "10";

        //act
        String result = ListSum.SumListWithWhile(input);

        //assert
        Assert.assertThat(result, containsString(expected));

    }

    @Test
    public void SumListWithRecursion_Returns10(){
        //arrange
        List<Integer> input = Arrays.asList(1,4,5);
        String expected = "10";

        //act
        String result = ListSum.SumListWithRecursion(input, 0, 0);

        //assert
        Assert.assertThat(result, containsString(expected));

    }

}