/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mason
 */
public class LandTract {
    
    private double tractLength;
    private double tractWidth;
    private double area;
    public LandTract() {
        area = 0.0;
    }
    public LandTract(double length, double width) {
        tractLength = length;
        tractWidth = width;
    }
    public double getLength(double length) {
        return length;
    }
    public double getWidth(double width) {
        return width;
    }
    public double getArea(double length, double width) {
        area = length * width;
        return area;
    }
    public double getArea() {
        area = this.tractLength * this.tractWidth;
        return area;
    }
    public boolean equals(LandTract tract2) {
        return this.area == tract2.area;
    }
    public String toString(int area) {
        return "Area: " + area;
    }
}

