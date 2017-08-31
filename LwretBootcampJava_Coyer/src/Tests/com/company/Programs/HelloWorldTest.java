package com.company.Programs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void GetMessageReturnsCorrectMessage(){
        String message = HelloWorld.GetMessage();
        assertEquals("Should equal Hello, World", "Hello, World", message);
    }
}