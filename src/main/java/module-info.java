module com.mycompany.samplecalc {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.samplecalc to javafx.fxml;
    exports com.mycompany.samplecalc;
}
