package com.example.pizzadelivery;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;

    @FXML
    private void handleLoginAction(ActionEvent event) {
        // Authentication logic here
        SceneNavigator.loadScene(SceneNavigator.MENU_SCENE);
    }
}
