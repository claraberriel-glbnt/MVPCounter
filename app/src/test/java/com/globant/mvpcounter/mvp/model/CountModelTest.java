package com.globant.mvpcounter.mvp.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountModelTest {

    private CountModel model;

    @Before
    public void setUp() {
        model= new CountModel();
    }

    @Test
    public void inc(){
        int original = model.getCount();
        model.inc();
        int result = model.getCount();
        assertEquals(original + 1, result);
    }
}