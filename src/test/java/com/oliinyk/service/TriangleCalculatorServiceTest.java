package com.oliinyk.service;


import com.oliinyk.configuration.ApplicationConfiguration;
import com.oliinyk.entity.Triangle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfiguration.class})

public class TriangleCalculatorServiceTest {

    @Autowired
    private TriangleCalculatorService triangleCalculatorService;

    @Test
    public void checkHypotenuse() {

        Triangle result = triangleCalculatorService.calculateHypotinusa(2, 2);

        Assert.assertEquals(2.83, result.getHypotenuse(), 0);

    }

    @Test
    public void checkHypotenuseNull() {

        Assert.assertNull("expected Null",
                triangleCalculatorService.calculateHypotinusa(-2, 2));

    }
}
