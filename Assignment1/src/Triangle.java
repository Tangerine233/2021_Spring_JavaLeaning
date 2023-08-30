/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Assignment#: 1
*/

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double s1, double s2, double s3){
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public Triangle(){
        this(3,4,5);
    }

    public double perimeter(){
        return (side1+side2+side3);
    }

    public double area(){
        double p = this.perimeter()/2;
        return Math.sqrt(p * (p-side1) * (p-side2) * (p-side3));
    }

    public double height(){
        //declare value
        double shortest;
        //find the shortest side
        if (side1<=side2&&side1<=side3){
            shortest = side1;
        }
        else if (side2<=side1&&side2<=side3){
            shortest = side2;
        }
        else shortest = side3;

        return (area()*2/shortest);
    }

    public String toString(){
        return "Triangle has sides "+side1+", "+side2+" and "+side3+". It has an area of "+area()+" and perimeter of "+perimeter()+".";
    }
    public String ToString(){
        return toString();
    }

}
