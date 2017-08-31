package com.company.Programs;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class HelloUserTest {

    @Test
    public void GetUserNameReturnsCorrectUsername(){
        String userName = "Devyn";
        System.setIn(new java.io.ByteArrayInputStream(userName.getBytes()));
        String name = HelloUser.GetUserName();
        Assert.assertEquals(userName, name);
    }

    @Test
    public void GetMessageReturnsCorrectMessage(){
        //arrange
        String name = "User";

        //act
        String message = HelloUser.GetMessage(name);

        //assert
        assertThat("Expected username to be included in message", message, containsString(name));
    }

}