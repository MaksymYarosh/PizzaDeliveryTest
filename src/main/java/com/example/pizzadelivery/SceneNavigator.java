package com.example.pizzadelivery;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneNavigator {
    public static final String LOGIN_SCENE = "/fxml/Login.fxml";
    public static final String MENU_SCENE = "/fxml/Menu.fxml";
    public static final String CUSTOMIZE_PIZZA_SCENE = "/fxml/CustomizePizza.fxml";
    public static final String ORDER_SCENE = "/fxml/Order.fxml";
    public static final String ACCOUNT_SCENE = "/fxml/Account.fxml";

    public static final String CONFIRMATION_SCENE = "/fxml/Confirmation.fxml";

    private static Stage stage;

    public static void setStage(Stage stage) {
        SceneNavigator.stage = stage;
    }

    public static void loadScene(String fxml) {
        try {
            Parent root = FXMLLoader.load(SceneNavigator.class.getResource(fxml));
            stage.setScene(new Scene(root));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

