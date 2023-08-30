/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Lab#: 8
*/

package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public int n1=-1;
    public int n2=-1;

    public Label display = new Label();
    public TextField text1 =new TextField();
    public TextField text2= new TextField();

    public void add(ActionEvent actionEvent) {
        n1 = Integer.parseInt(text1.getText());
        n2 = Integer.parseInt(text2.getText());
        display.setText(String.valueOf(n1+n2));
    }

    public void clear(ActionEvent actionEvent) {
        display.setText("");
    }
}
