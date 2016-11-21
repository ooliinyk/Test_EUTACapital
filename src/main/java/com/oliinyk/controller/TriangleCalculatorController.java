package com.oliinyk.controller;


import com.oliinyk.entity.Triangle;
import com.oliinyk.service.TriangleCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TriangleCalculatorController {


    @Autowired
    TriangleCalculatorService triangleCalculatorService;


    @RequestMapping(value = "/calculate/cathetusA={cathetusA}/cathetusB={cathetusB}", method = RequestMethod.GET)
    public Triangle calculateHypotinusa(@PathVariable double cathetusA, @PathVariable double cathetusB) {

        return triangleCalculatorService.calculateHypotinusa(cathetusA,cathetusB);

    }


}
