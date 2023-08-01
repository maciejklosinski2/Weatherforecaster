package pl.klosinski.controller;

import pl.klosinski.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.*;

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