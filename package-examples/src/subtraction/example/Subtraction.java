package subtraction.example;

public class Subtraction {
    //declare method for Subtraction
    public void sub() {
        double a = 45.62;
        double b = 12.53;
        double minus=a-b;
//print output
        System.out.println("SUBTRACTION OF TWO NUMBERS:"+ minus);
    }

    //Main method to execute the program
    public static void main(String[] args) {
        Subtraction get1 = new Subtraction();
//create object for class
        get1.sub();
//calling sub method to perform subtraction
    }
}
