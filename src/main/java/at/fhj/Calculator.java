package at.fhj;
        /**
         * The Calculator class represents a small calculator that perform basic arithmetic operations.
         * @aauthor Stefan Jovic
         */
public class Calculator {

    private double input1;
    private double input2;

        /**
         * Constructs new calculator object.
         */
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

        /**
         * Constructs new calculator object with the input1 and input2 values.
         * @param number1 The value of first input.
         * @param number2 The value of second input.
         */
    public Calculator (double number1, double number2) {
        this.input1 = number1;
        this.input2 = number2;
    }

        /**
         * Adds two numbers and returns the result.
         * @param number1 First number to add.
         * @param number2 Second number to add.
         * @return The sum of the two numbers.
         */
    public double add(double number1, double number2) {
        return number1 + number2;
    }

        /**
         * Subtracts the second number from the first and returns the result.
         * @param number1 The first number.
         * @param number2 The second number which is subtracted.
         * @return The difference between the two numbers.
         */
    public double minus(double number1, double number2){

        return number1 - number2;
    }

        /**
         * Divides first number by the second number and returns the result.
         * @param number1 The number which will be divide.
         * @param number2 The number to divide by.
         * @return The division result.
         * @throws ArithmeticException If the second number is zero (division by zero).
         */
    public double divide(double number1, double number2) {
        if (number2 == 0){
            throw new ArithmeticException("Division by zero!");
        }
        return number1/number2;
    }

        /**
         * Mltiplies the two numbers.
         * @param number1 The first number to multiply.
         * @param number2 The second number to multiply.
         * @return The product of the two numbers.
         */
    public double multiply(double number1 , double number2){
        return number1 * number2;
    }

}
