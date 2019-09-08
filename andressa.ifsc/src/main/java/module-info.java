module andressa.andressa.ifsc {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.base;

    opens andressa.andressa.ifsc to javafx.fxml;
    exports andressa.andressa.ifsc;
}