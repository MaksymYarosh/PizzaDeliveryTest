package com.example.pizzadelivery;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class MenuController {

    @FXML
    private ListView<String> pizzaList;

    @FXML
    public void initialize() {
        // Load pizza menu items into the list
        pizzaList.getItems().addAll("Margherita", "Pepperoni", "Veggie");
    }

    @FXML
    private void handlePizzaSelect() {
        SceneNavigator.loadScene(SceneNavigator.CUSTOMIZE_PIZZA_SCENE);
    }
}


