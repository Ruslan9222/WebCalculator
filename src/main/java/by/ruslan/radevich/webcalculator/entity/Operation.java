package by.ruslan.radevich.webcalculator.entity;


import lombok.Data;

@Data
public class Operation {
    private double num1;
    private double num2;
    private String type;
    private double result;

}
