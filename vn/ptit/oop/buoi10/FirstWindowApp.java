/*
 * Họ và tên: Hoàng Thị Huyền Trang
 * MSSV: N24DCCN083
 * Ngày: 08/11/2026
 * Mô tả: Bài 10.1 - Cửa sổ đầu tiên bằng JavaFX thay thế Applet, hiển thị thông tin sinh viên và nút đóng[cite: 25].
 */
package vn.ptit.oop.buoi10;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Ứng dụng JavaFX Bài 10.1 hiển thị thông tin họ tên, MSSV và nút đóng cửa sổ.
 * 
 * @author Hoàng Thị Huyền Trang - N24DCCN083
 */
public class FirstWindowApp extends Application {

    /**
     * Khởi tạo giao diện chính của ứng dụng JavaFX.
     * 
     * @param stage Cửa sổ chính (Stage)
     */
    @Override
    public void start(Stage stage) {
        // Tạo Label chứa họ tên và MSSV
        Label infoLabel = new Label("Họ tên: Hoàng Thị Huyền Trang - MSSV: N24DCCN083");
        infoLabel.setStyle("-fx-font-size: 14px; -fx-font-weight: bold; -fx-text-fill: #2c3e50;");

        // Tạo Button "Đóng"
        Button closeButton = new Button("Đóng");
        closeButton.setStyle("-fx-font-size: 12px; -fx-padding: 6px 18px; -fx-cursor: hand;");
        
        // Đăng ký sự kiện đóng cửa sổ khi bấm nút theo đúng gợi ý đề bài
        closeButton.setOnAction(e -> stage.close());

        // Sắp xếp các thành phần vào bố cục VBox (theo chiều dọc)
        VBox root = new VBox(20);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(25));
        root.getChildren().addAll(infoLabel, closeButton);

        // Tạo Scene, gắn vào Stage và hiển thị
        Scene scene = new Scene(root, 420, 200);
        stage.setTitle("Bài 10.1 - Cửa sổ JavaFX (Thay thế Applet)");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Phương thức main khởi chạy chương trình JavaFX.
     * 
     * @param args Tham số dòng lệnh
     */
    public static void main(String[] args) {
        launch(args);
    }
}