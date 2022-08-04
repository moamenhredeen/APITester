package com.moamen.event;

import javafx.stage.Stage;
import org.springframework.context.ApplicationEvent;

public class StageReadyEvent extends ApplicationEvent {

    public Stage getStage(){
        return (Stage) getSource();
    }

    public StageReadyEvent(final Stage stage) {
        super(stage);
    }
}
