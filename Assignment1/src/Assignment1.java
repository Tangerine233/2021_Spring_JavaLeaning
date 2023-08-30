/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Assignment#: 1
*/

public class Assignment1 {
    public static void main(String[] args) {
        //Using a loop print out the area and circumference of circles with radius 1, 2, 3 …9, 10.
        for (int i =1;i<=10;i++){
            //call Circle()
            Circle c = new Circle(i);
            //print line
            System.out.println("Area of a circle with radius "+i+" is "+ c.area() +" circumference is " + c.circumference());
        }



        //Using nested loops, print out the area and perimeter of rectangles with width 1, 2
        //and 3 and heights 1, 2, and 3. Ie, you’ll print out the area and perimeter for a
        //rectangle 1x1, 1x2, 1x3, 2x1, 2x2, 2x3, 3x1, 3x2, and 3x3.
        for (int w =1; w<=3; w++){
            for (int h =1; h<=3; h++){
                //call Rectangle()
                Rectangle r = new Rectangle(h,w);
                System.out.println("Area of a rectangle "+w+" by "+h+" is "+ r.area() +" it's perimeter is "+r.perimeter());
            }
        }


        // Create a triangle with sides 18, 30 and 24. Calculate its area, perimeter and height and print them
        //declare values
        double s1 =18;
        double s2 =30;
        double s3 =24;
        //call Triangle()
        Triangle t = new Triangle(s1,s2,s3);
        System.out.println("Area of a triangle "+s1+"x"+s2+"x"+s3+" is "+t.area()+" it's perimeter is "+t.perimeter()+" and it's height is "+t.height());


        //Create a triangle of size 3,4,5 by calling the constructor with no parameters.
        //Calculate its area, perimeter and height and print like the one above
        //call Triangle()
        Triangle dT = new Triangle();
        System.out.print("Area of a triangle "+3+"x"+4+"x"+5+" is "+dT.area()+" it's perimeter is "+dT.perimeter()+" and it's height is "+dT.height());
    }

}
