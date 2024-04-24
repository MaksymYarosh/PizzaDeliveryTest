package com.example.pizzadelivery;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class OrderController {

    @FXML
    private TextField addressField;

    @FXML
    private void handlePlaceOrder() {
        // Process order and payment
        SceneNavigator.loadScene(SceneNavigator.CONFIRMATION_SCENE);
    }
}

