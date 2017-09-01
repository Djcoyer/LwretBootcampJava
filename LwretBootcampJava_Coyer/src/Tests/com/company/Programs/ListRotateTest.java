package com.company.Programs;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;

public class ListRotateTest {

    @Test
    public void GetList_ReturnsListOfNumbers(){
        //arrange

        //act
        List<Integer> numbers = ListRotate.GetList();

        //assert
        Assert.assertNotNull("Should return list of integers", numbers);
    }

    @Test
    public void PrintList_PrintsListGiven(){
        //arrange
        List<Integer> input = new ArrayList<Integer>(Arrays.asList(1,2,3));
        String expected = "1, 2, 3";

        //act
        String result = ListRotate.PrintList(input);

        //assert
        Assert.assertThat("Should return numbers input", result, containsString(expected));
    }

    @Test
    public void GetRotateNum_ReturnsInputNumber(){
        //arrange
        Integer input = 3;
        int expected = 3;
        System.setIn(new java.io.ByteArrayInputStream(input.toString().getBytes()));

        //act
        int result = ListRotate.GetRotateNum();

        //assert
        Assert.assertEquals("", expected, result);
    }

    @Test
    public void RotateList_ReturnsRotatedList(){
        //arrange
        String expected = "2, 3, 4, 5, 6, 1";
        int rotateNum = 1;

        //act
        String result = ListRotate.RotateList(rotateNum);

        //assert
        Assert.assertThat("List should be rotated by 1", result, containsString(expected));
    }

    @Test
    public void TryParseInt_ReturnsTrueForIntegerValue(){
        //arrange
        String input = "3";
        boolean expected = true;

        //act
        boolean result = ListRotate.TryParseInt(input);

        //assert
        Assert.assertEquals(expected,result);
    }

}