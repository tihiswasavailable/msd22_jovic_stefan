    package at.fhj;
    import java.util.Scanner;


    /**
     * The Main class is executing the calculator application.
     *
     * @aauthor Stefan Jovic
    */

    public class Main {

        public static void main (String[] args){
            Scanner scanner = new Scanner(System.in);

            double [] inputs = getInput(scanner);
            double input1 = inputs[0];
            double input2 = inputs[1];

            Calculator calculator = new Calculator();
            calculator.setInput1(inputs[0]);
            calculator.setInput2(inputs[1]);

            double resultAdd = calculator.add(calculator.getInput1(), calculator.getInput2());
            System.out.println(+resultAdd);

            double resultMinus = calculator.minus(calculator.getInput1(), calculator.getInput2());
            System.out.println(+resultMinus);

            try {
                double resultDivision = calculator.divide(calculator.getInput1(), calculator.getInput2());
                System.out.println(+resultDivision);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }

            double resultMultiply = calculator.multiply(calculator.getInput1(), calculator.getInput2());
            System.out.println(+resultMultiply);
            scanner.close();

        }

        /**
         * Scans two double variable from the user via the provided Scanner.
         * @param scanner The Scanner object used to read the input of the user.
         * @return An array of two double values provided by the user in the console. 
         */

        public static double[] getInput(Scanner scanner) {
            System.out.println("Please enter two double values:");

            double input1 = 0;
            double input2 = 0;

            if (scanner.hasNextDouble() == true){
                input1 = scanner.nextDouble();
                System.out.println("Your first number is: "+input1);
            }else {
                System.out.println("Please enter a double value!");
            }

            if (scanner.hasNextDouble() == true){
                input2 = scanner.nextDouble();
                System.out.println("Your second number is: "+input2);
            }else {
            System.out.println("Please enter a double value!");
            }
            return new double[]{input1, input2};
        }
    }
