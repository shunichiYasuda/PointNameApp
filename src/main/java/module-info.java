module com.yasudaInternational.tools.PointNameApp {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;

    opens com.yasudaInternational.tools.PointNameApp to javafx.fxml;
    exports com.yasudaInternational.tools.PointNameApp;
}