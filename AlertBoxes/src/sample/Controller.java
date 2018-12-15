package sample;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;

import java.util.Optional;

public class Controller {

    private Main main;

    public void setMain(Main main){
        this.main = main;
    }

    public void showAlert1(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText("Information header text");
        alert.setContentText("This is the information text that is displayed to the user.");
        alert.showAndWait();
    }

    public void showAlert2(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Error header");
        alert.setContentText("This is a very fatal error!!!");
        alert.showAndWait();
    }

    public void showAlert3(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText("Confirmation");
        alert.setContentText("Press OK to confirm this notice");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            System.out.println("OK button was clicked.");
        } else {
            System.out.println("Cancel was clicked.");
        }
    }

    public void showAlert4(){
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Input");
        dialog.setContentText("Please enter your age:");
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent() && !result.get().equals("")){
            System.out.println("Your age is " + result.get());
        } else {
            System.out.println("You didn't enter your age....");
        }
    }

}
