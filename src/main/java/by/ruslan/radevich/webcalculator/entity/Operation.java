package by.ruslan.radevich.webcalculator.entity;


//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public interface Operation {
    Operation execute();

    double result();

    String author();

    enum Type {
        ABS, COS, DIV, FLOOR, LOG, MUL, SIN, SUB, SUM, TAN
    }


//    private double num1;
//    private double num2;
//    private String type;
//    private double result;
//    private User


}
