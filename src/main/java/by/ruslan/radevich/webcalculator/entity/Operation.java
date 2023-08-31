package by.ruslan.radevich.webcalculator.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.sql.RowSet;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public interface Operation {
    Operation execute();

    double result();
    User author();



//    private double num1;
//    private double num2;
//    private String type;
//    private double result;
//    private User author;


}
