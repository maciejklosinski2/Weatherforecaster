package pl.klosinski.controller;

import pl.klosinski.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class MainAppWindowController extends BaseController {
    public MainAppWindowController(ViewFactory viewFactory, String fxmlName) {
        super(viewFactory, fxmlName);
    }
    @FXML
    private AnchorPane mainAnchorPane;
    @FXML
    private GridPane leftGridPane;
    @FXML
    private GridPane rightGridPane;
    @FXML
    private Label userLocationLabel;
    @FXML
    private TextField userLocationTextField;
    @FXML
    private Label destinationLocationLabel;
    @FXML
    private TextField destinationLocationTextField;
}