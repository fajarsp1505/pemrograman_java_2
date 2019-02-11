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
public class Rectangle extends Shape {

    private final String name;
    private final long length;
    private final long width;

    public Rectangle(String name, long length, long width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public long getLength() {
        return length;
    }

    public long getWidth() {
        return width;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return length * width;
    }

}