/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Assignment#: 1
*/

public class Rectangle {
    private double height;
    private double width;

    public Rectangle(double h, double w){
        height = h;
        width = w;
    }

    public double perimeter(){
        return (2*height+2*width);
    }

    public double area(){
        return (height*width);
    }
}
