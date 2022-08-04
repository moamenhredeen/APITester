package com.moamen.eventlistener;

import com.moamen.common.ViewLoader;
import com.moamen.event.StageReadyEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class StageReadyEventListener implements ApplicationListener<StageReadyEvent> {

    private final ViewLoader viewLoader;

    public StageReadyEventListener(final ViewLoader viewLoader) {
        this.viewLoader = viewLoader;
    }


    @Override
    public void onApplicationEvent(final StageReadyEvent event) {
        var stage = event.getStage();
        var root = this.viewLoader.<Parent>load("/widgets/App.fxml");
        var scene = new Scene(root, 1200, 600);
        stage.setScene(scene);
        stage.setTitle("API TESTER");
        stage.show();

    }
}
