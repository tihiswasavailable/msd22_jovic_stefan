package at.fhj;

public class Calculator {

    private double input1;
    private double input2;


    public Calculator() {

    }

    public double getInput1() {
        return input1;
    }

    public double getInput2() {
        return input2;
    }

    public void setInput1(double input1) {
        this.input1 = input1;
    }

    public void setInput2(double input2) {
        this.input2 = input2;
    }

    public Calculator (double number1, double number2) {
        this.input1 = number1;
        this.input2 = number2;
    }

    public double add(double number1, double number2) {


        return number1 + number2;
    }

    public double minus(double number1, double number2){

        return number1 - number2;
    }

    public double divide(double number1, double number2) {
        if (number2 == 0){
            throw new ArithmeticException("Division by zero!");
        }
        return number1/number2;
    }

    public double multiply(double number1 , double number2){

        return number1 * number2;
    }

}
