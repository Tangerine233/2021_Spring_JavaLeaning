/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Lab#: 7
*/

interface CalcOp{
    float add(float x, float y);
    float subtract(float x, float y);
    float multiply(float x, float y);
    float divide(float x, float y);
}

class Calculator implements CalcOp {


    @Override
    public float add(float x, float y) {
        return x+y;
    }

    @Override
    public float subtract(float x, float y) {
        return x-y;
    }

    @Override
    public float multiply(float x, float y) {
        return x*y;
    }

    @Override
    public float divide(float x, float y) {
        return x/y;
    }
}
