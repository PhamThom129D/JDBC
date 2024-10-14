module com.example.testsql {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.testsql to javafx.fxml;
    exports com.example.testsql;
    exports com.example.testsql.ThucHanh;
    exports com.example.testsql.DB;
    opens com.example.testsql.ThucHanh;
    opens com.example.testsql.DB to javafx.fxml;
}