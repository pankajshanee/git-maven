package com.demo;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void getNameTest(){
    	App app = new App();
    	Assert.assertEquals("Pankaj Shandilya", app.getName("Pankaj", "Shandilya"));
    }
}
