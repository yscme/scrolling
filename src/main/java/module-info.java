module cn.yscme.scrolling {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.bootstrapfx.core;
    requires protobuf.java;
    requires driver.bundle;
    requires playwright;
    opens cn.yscme.scrolling to javafx.fxml;
    exports cn.yscme.scrolling;
    exports cn.yscme.scrolling.auto.douyin to protobuf.java;
    exports cn.yscme.scrolling.controller;
    opens cn.yscme.scrolling.controller to javafx.fxml;
}