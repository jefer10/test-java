package javatest.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void test_Repeat() {
        Assert.assertEquals("holaholahola",StringUtil.repeat("hola",3));
    }

    @Test
    public void repeat_string_once(){
        Assert.assertEquals("hola",StringUtil.repeat("hola",1));
    }

    @Test(expected = IllegalArgumentException.class)//cuando lo esparado es una exepcion
    public void repeat_string_negativa(){
        StringUtil.repeat("hola",-1);
    }

}