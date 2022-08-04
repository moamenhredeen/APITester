package com.moamen;

import com.moamen.event.StageReadyEvent;
import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.io.IOException;

/**
 * JavaFX App
 */
public class FXApplication extends Application {

    private GenericApplicationContext applicationContext;

    @Override
    public void init() throws Exception {
        this.applicationContext = new AnnotationConfigApplicationContext(FXApplicationContext.class);
    }

    @Override
    public void start(Stage stage) throws IOException {
        this.applicationContext.publishEvent(new StageReadyEvent(stage));
    }
}