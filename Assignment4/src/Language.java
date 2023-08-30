/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Assignment#: 4
*/

//Define an abstract Language class
abstract class Language {
    //● It should have 4 abstract methods all of which should return a string:
    //○ make_guess()
    public abstract String make_guess();
    //○ too_low()
    public abstract String too_low();
    //○ too_high()
    public abstract String too_high();
    //○ correct()
    public abstract String correct();

}



//● Define a class called English which inherits from Language.
class English extends Language{

    @Override
    public String make_guess() {
        return "Guess a number";
    }

    @Override
    public String too_low() {
        return "Too Low";
    }

    @Override
    public String too_high() {
        return "Too High";
    }

    @Override
    public String correct() {
        return "Correct";
    }
}

//● Define a class called Spanish which inherits from Language.
class Spanish  extends Language{

    @Override
    public String make_guess() {
        return "Adivina un numero";
    }

    @Override
    public String too_low() {
        return "Demasiado bajo";
    }

    @Override
    public String too_high() {
        return "Demasiado alto";
    }

    @Override
    public String correct() {
        return "Correcto";
    }
}

//● Define a class called French which inherits from Language.
class French  extends Language{

    @Override
    public String make_guess() {
        return "Devinez un nombre";
    }

    @Override
    public String too_low() {
        return "Trop bas";
    }

    @Override
    public String too_high() {
        return "Trop haut";
    }

    @Override
    public String correct() {
        return "Correct";
    }
}

//● Define a class called SimplifiedChinese which inherits from Language.
class SimplifiedChinese  extends Language{

    @Override
    public String make_guess() {
        return "猜一个数字";
    }

    @Override
    public String too_low() {
        return "太低";
    }

    @Override
    public String too_high() {
        return "太高";
    }

    @Override
    public String correct() {
        return "正确";
    }
}