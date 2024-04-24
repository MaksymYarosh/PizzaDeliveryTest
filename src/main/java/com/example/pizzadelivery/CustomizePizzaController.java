package com.example.pizzadelivery;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class CustomizePizzaController {

    @FXML
    private ComboBox<String> sizeBox;
    @FXML
    private ComboBox<String> crustTypeBox;

    @FXML
    public void initialize() {
        sizeBox.getItems().addAll("Small", "Medium", "Large");
        crustTypeBox.getItems().addAll("Thin", "Thick", "Cheese Stuffed");
    }

    @FXML
    private void handleOrder() {
        // Add custom pizza to order
        SceneNavigator.loadScene(SceneNavigator.ORDER_SCENE);
    }
}

