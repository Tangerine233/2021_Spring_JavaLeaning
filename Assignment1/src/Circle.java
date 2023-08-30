/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Assignment#: 1
*/

public class Circle {
    private double radius;


    public Circle(double d){
        radius = d;
    }

    public double circumference(){
        return (2* Math.PI * radius);
    }

    public double area(){
        return (Math.PI * Math.pow(radius, 2));
    }


}
