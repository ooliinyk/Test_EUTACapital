package com.oliinyk.service;

import com.oliinyk.entity.Triangle;
import com.oliinyk.utility.Logger;
import org.springframework.stereotype.Service;



@Service("TriangleCalculatorService")
public class TriangleCalculatorServiceImpl extends Logger implements TriangleCalculatorService {


    @Override
    public Triangle calculateHypotinusa(double cathetusA, double cathetusB) {

        try {
            if(cathetusA<0 || cathetusB<0){
                throw new IllegalArgumentException();
            }

            return  new Triangle(((double)(Math.round( Math.sqrt(cathetusA*cathetusA +
                    cathetusB*cathetusB)*100))/100), cathetusA, cathetusB);

        } catch (IllegalArgumentException e){
            logger.error("cathetus should be > 0",e);
            return  null;

        }





    }
}
