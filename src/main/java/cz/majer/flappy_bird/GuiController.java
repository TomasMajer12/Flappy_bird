package cz.majer.flappy_bird;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class GuiController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}