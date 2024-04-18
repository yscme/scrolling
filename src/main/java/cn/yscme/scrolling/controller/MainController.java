package cn.yscme.scrolling.controller;
import cn.yscme.scrolling.auto.DouyinUtil;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainController {
    @FXML
    private Label timerLabel,peopleLabel;
    @FXML
    private TextField roomidTextFieid;
    @FXML
    private TextArea chatTextArea,giftTextArea,otherTextArea;
    @FXML
    protected void onHelloButtonClick() {
        // 创建一个耗时任务
        Task<Void> task = new Task<>() {
            @Override
            protected Void call() {
                // 在这里执行耗时任务，比如模拟一个耗时操作
                DouyinUtil douyinUtil = new DouyinUtil();
                Platform.runLater(()->{
                    timerLabel.setText("0秒");
                });
                douyinUtil.start(Long.parseLong(roomidTextFieid.getText()),timerLabel,peopleLabel,chatTextArea,giftTextArea,otherTextArea);
                return null;
            }
        };

        // 当任务完成时，更新UI
        task.setOnSucceeded(e -> {

        });
        // 启动任务
        new Thread(task).start();
    }
}