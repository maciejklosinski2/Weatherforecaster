package pl.klosinski.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.klosinski.controller.BaseController;
import pl.klosinski.controller.MainAppWindowController;
import java.io.IOException;
import java.util.ArrayList;

public class ViewFactory {
    private ArrayList<Stage> activeStages;
    public ViewFactory() {
        activeStages = new ArrayList<Stage>();
    }

    public void showMainWindow(){
        BaseController controller = new MainAppWindowController(this, "mainAppWindow.fxml");
        initializeStage(controller);
    }
    private void initializeStage(BaseController baseController){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/pl.klosinski/" + baseController.getFxmlName()));
        fxmlLoader.setController(baseController);
        Parent parent;
        try {
            parent = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        activeStages.add(stage);
    }
}