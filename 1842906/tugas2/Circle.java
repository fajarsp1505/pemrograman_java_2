/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author Fajar Sanggi Peratama (1842906)
 */
public class Circle extends Shape {

    private final float radius;
    private final String name;
    double phi = 3.14;
    
    public Circle(float radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

}