package sample.lab2;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class lab2 {

    public void start(Stage primaryStage) throws Exception{
//      Parent root = FXMLLoader.load(getClass().getResource("lab1.fxml"));
//      GridPane bolon VBox container ashiglan hiisen
        GridPane root = new GridPane();

        root.setPadding(new Insets(10));
        root.setVgap(10);
        root.setHgap(10);
        root.setMinWidth(100);

        VBox leftVBox = leftVbox();
        root.add(leftVBox, 0,0, 1,1);

        GridPane middleGridPane = middleGridPane();
        root.add(middleGridPane, 1, 0,1,1);

        VBox rightVBox = rightVBox();
        root.add(rightVBox, 2 , 0, 1, 1);

        Scene scene = new Scene(root);
        scene.getStylesheets().add("sample/css/main2.css");
        primaryStage.setTitle("Find Replace");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image("sample/assets/java.png"));
        primaryStage.show();
    }

    VBox leftVbox(){
        VBox root = new VBox();

        root.setPadding(new Insets(10, 0, 0,0));
        root.setSpacing(12);

        Label find = new Label("Find What:");
        Label replace = new Label("Replace With:");

        root.getChildren().add(find);
        root.getChildren().add(replace);

        return root;
    }

    GridPane middleGridPane(){
        GridPane root = new GridPane();

        root.setPadding(new Insets(5));
        root.setHgap(5);
        root.setVgap(5);

        root.add(topVBox(), 0,0,3,1);
        root.add(bottomLeftVBox(), 1,1);
        root.add(bottomRightVBox(), 2, 1);

        return root;
    }

    VBox topVBox(){
        VBox root = new VBox();

        root.setSpacing(5);

        TextField find = new TextField("");
        TextField replace = new TextField("");

        root.getChildren().add(find);
        root.getChildren().add(replace);

        return root;
    }

    VBox bottomLeftVBox(){
        VBox root = new VBox();

        root.setSpacing(10);

        CheckBox match = new CheckBox("Match case");
        root.getChildren().add(match);

        CheckBox whole = new CheckBox("Whole words");
        root.getChildren().add(whole);

        CheckBox regular = new CheckBox("Regular expressions");
        root.getChildren().add(regular);

        CheckBox highlight = new CheckBox("Highlight results");
        highlight.setSelected(true);
        root.getChildren().add(highlight);

        return root;
    }

    VBox bottomRightVBox(){
        VBox root = new VBox();

        root.setSpacing(10);

        CheckBox wrap = new CheckBox("Wrap around");
        wrap.setSelected(true);
        root.getChildren().add(wrap);

        CheckBox search = new CheckBox("Search selection");
        search.setDisable(true);
        root.getChildren().add(search);

        CheckBox search2 = new CheckBox("Search backwards");
        root.getChildren().add(search2);

        CheckBox incremental = new CheckBox("Incremental search");
        incremental.setSelected(true);
        root.getChildren().add(incremental);

        return root;
    }

    VBox rightVBox(){
        VBox root = new VBox();

        root.setSpacing(10);

        Button find = new Button("Find");
        find.getStyleClass().add("button");
        root.getChildren().add(find);

        Button replace = new Button("Replace");
        replace.getStyleClass().add("button");
        root.getChildren().add(replace);

        Button replaceAll = new Button("Replace all");
        replaceAll.getStyleClass().add("button");
        root.getChildren().add(replaceAll);

        Button close = new Button("Close");
        close.getStyleClass().add("button");
        root.getChildren().add(close);

        Button help = new Button("Help");
        root.getChildren().add(help);

        return root;
    }

}
