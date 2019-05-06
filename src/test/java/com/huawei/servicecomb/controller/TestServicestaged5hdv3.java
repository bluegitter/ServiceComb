package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestServicestaged5hdv3 {

        Servicestaged5hdv3Delegate servicestaged5hdv3Delegate = new Servicestaged5hdv3Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = servicestaged5hdv3Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}