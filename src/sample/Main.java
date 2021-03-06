package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//      Parent root = FXMLLoader.load(getClass().getResource("lab1.fxml"));
        GridPane root = new GridPane();
        root.setHgap(10);

        Label zuun = new Label("Zuun");
        zuun.getStyleClass().add("width");
        StackPane zuunTitledContent = new BorderedTitledPane("Title", zuun, Pos.TOP_LEFT);
        root.add(zuunTitledContent, 0,0);

        Label dund = new Label("Dund");
        dund.getStyleClass().add("width");
        StackPane dundTitledContent = new BorderedTitledPane("Title", dund, Pos.TOP_CENTER);
        root.add(dundTitledContent, 1,0);

        Label baruun = new Label("Baruun");
        baruun.getStyleClass().add("width");
        StackPane baruunTitledContent = new BorderedTitledPane("Title", baruun, Pos.TOP_RIGHT);
        root.add(baruunTitledContent, 2,0);

        Scene scene = new Scene(root);
        scene.getStylesheets().add("sample/css/main3.css");
        primaryStage.setTitle("Titled border");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image("sample/assets/java.png"));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    class BorderedTitledPane extends StackPane {
        BorderedTitledPane(String titleString, Node content, Pos Position) {
            Label title = new Label("  " + titleString + "  ");
            title.getStyleClass().add("bordered-titled-title");
            StackPane.setAlignment(title, Position);

            StackPane contentPane = new StackPane();
            content.getStyleClass().add("bordered-titled-content");
            contentPane.getChildren().add(content);

            getStyleClass().add("bordered-titled-border");
            getChildren().addAll(title, contentPane);
        }
    }
}