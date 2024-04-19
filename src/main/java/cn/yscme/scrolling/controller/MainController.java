package cn.yscme.scrolling.controller;

import cn.yscme.scrolling.auto.DouyinUtil;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.util.Duration;

public class MainController {
    @FXML
    private Label timerLabel, peopleLabel;
    @FXML
    private TextField roomidTextFieid;
    @FXML
    private ListView<String> chatListView, giftListView, otherListView;

    private ObservableList<String> chatMessages = FXCollections.observableArrayList();
    private ObservableList<String> giftMessages = FXCollections.observableArrayList();
    private ObservableList<String> otherMessages = FXCollections.observableArrayList();


    @FXML
    protected void onHelloButtonClick() {
        chatListView.setItems(chatMessages);
        giftListView.setItems(giftMessages);
        otherListView.setItems(otherMessages);

        // 创建一个耗时任务
        Task<Void> task = new Task<>() {
            @Override
            protected Void call() {
                // 在这里执行耗时任务，比如模拟一个耗时操作
                DouyinUtil douyinUtil = new DouyinUtil();
                Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
                    int timeSeconds = 0;
                    @Override
                    public void handle(ActionEvent event) {
                        // 每次时间间隔执行的任务
                        timeSeconds++;
                        Platform.runLater(() -> {
                            timerLabel.setText("计时器："+timeSeconds + "秒");
                        });
                    }
                }));
                timeline.setCycleCount(Timeline.INDEFINITE);
                timeline.play();

                douyinUtil.start(Long.parseLong(roomidTextFieid.getText()), peopleLabel, chatMessages, giftMessages, otherMessages, chatListView, giftListView, otherListView);
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