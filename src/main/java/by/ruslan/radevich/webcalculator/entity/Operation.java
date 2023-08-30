package by.ruslan.radevich.webcalculator.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Operation {
    private double num1;
    private double num2;
    private String type;
    private double result;
    private User author;


}
