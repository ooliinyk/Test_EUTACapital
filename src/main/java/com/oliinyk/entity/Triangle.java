package com.oliinyk.entity;


public class Triangle {

    private double hypotenuse;
    private double  cathetusA;
    private double  cathetusB;

    public Triangle() {
    }

    public Triangle(double hypotenuse, double cathetusA, double cathetusB) {
        this.hypotenuse = hypotenuse;
        this.cathetusA = cathetusA;
        this.cathetusB = cathetusB;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    public double getCathetusA() {
        return cathetusA;
    }

    public void setCathetusA(double cathetusA) {
        this.cathetusA = cathetusA;
    }

    public double getCathetusB() {
        return cathetusB;
    }

    public void setCathetusB(double cathetusB) {
        this.cathetusB = cathetusB;
    }
}
