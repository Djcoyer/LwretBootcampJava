package com.company.Programs;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;

public class HelloUserTest {

    @Test
    public void GetMessageReturnsCorrectMessage(){
        //arrange
        String name = "User";

        //act
        String message = HelloUser.GetMessage(name);

        //assert
        Assert.assertThat("Expected username to be included in message", message, containsString(name));
    }

}