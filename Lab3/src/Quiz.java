/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Lab#: 3
*/

import java.util.*;
public class Quiz {
    public static Scanner sc = new Scanner(System.in);

    //declare values
    String q;
    String a;
    String userAnswer;
    int d;
    int n;

    //declare array lists
    ArrayList<String> question = new ArrayList<String>();
    ArrayList<String> answer = new ArrayList<String>();
    ArrayList<Integer> difficulty = new ArrayList<Integer>();

    //default constructor
    public Quiz(){
    }



    //1. add_question() Method should prompt the user for a new question, answer and difficulty,
    //and then create a Question object with that data and add it to the arraylist/list.
    public void add_question(){
        //add question
        System.out.println("What is the question Text?");
        q = sc.nextLine();
        question.add(q);

        //add answer
        System.out.println("What is the answer?");
        a = sc.nextLine();
        answer.add(a);

        //add difficulty
        //do-while loop to make sure input is in the range from 1 to 3
        do {
            System.out.println("How Difficult (1-3)?");
            d = sc.nextInt();
            sc.nextLine();
            if ((d>3||d<1)) System.out.println("Error: invalid input\nReEnter: ");
            else difficulty.add(d);
        } while (d>3||d<1);
    }



    //2. remove_question() Method should present the user with a list of all the question texts,
    //and ask which one to remove. When the user indicates the question to remove, it should
    //remove that question from the arraylist/list.
    public void remove_question(){
        System.out.println("Choose the question to remove?");
        //loop for each item in each arraylist
        for (int i=0; i<question.size();i++){
            System.out.println(i+". "+question.get(i));
        }
        //remove question
        do{
            n = sc.nextInt();
            sc.nextLine();
            if (n<0||n>=question.size()) System.out.println("Error: invalid input\nReEnter:");
            else {
                question.remove(n);
                answer.remove(n);
                difficulty.remove(n);
            }
        }while(n<0||n>question.size());
    }



    //3. modify_question() Method should present the user with a list of all the question texts, and
    //ask which one to change. Then it should prompt the user for the new question text, the
    //new question answer, and the new difficulty, and update the appropriate question in the
    //arraylist.
    public void modify_question(){
        System.out.println("Choose the question to modify?");
        //loop for each item in each arraylist
        for (int i=0; i<question.size();i++){
            System.out.println(i+". "+question.get(i));
        }
        //modify question
        do{
            n = sc.nextInt();
            sc.nextLine();
            if (n<0||n>=question.size()) System.out.println("Error: invalid input\nReEnter:");
            else {
                System.out.println("What is the question Text?");
                q = sc.nextLine();
                question.set(n,q);
                System.out.println("What is the answer?");
                a = sc.nextLine();
                answer.set(n,a);
                //do-while loop to make sure input is in the range from 1 to 3
                do {
                    System.out.println("How Difficult (1-3)?");
                    d = sc.nextInt();
                    sc.nextLine();
                    if ((d>3||d<1)) System.out.println("Error: invalid input\nReEnter: ");
                    else difficulty.add(d);
                } while (d>3||d<1);
            }
        }while(n<0||n>question.size());
    }


    //4. give_quiz() Method should present each question to the user, accept an answer (string)
    //for each question. It should then tell the user if they are correct or wrong (if the string the
    //user typed in exactly matches the correct answer stored in the question object they are
    //correct). Keep track of their score. At the end of the quiz, tell the user how many they
    //got correct.
    public void give_quiz(){
        int counterT=0;
        for (int i=0; i<question.size();i++){
            System.out.println(question.get(i));
            userAnswer = sc.nextLine();
            if (userAnswer.equals(answer.get(i))) {
                System.out.println("Correct");
                counterT++;
            }
            else {
                System.out.println("Incorrect");
            }
        }
        System.out.println("You got "+ counterT + " out of "+ question.size());
    }
}
