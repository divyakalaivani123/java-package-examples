package division.example;

public class Division {
    //declare method
    public void div() {
        long a = 14568;
        short b = 156;
        float calc=a/b;
//print output
        System.out.println("DIVISION OF TWO NUMBERS:"+ calc);
    }

    //Main method to execute the program
    public static void main(String[] args) {
        Division get3 = new Division();
//create object for class
        get3.div();
//calling div method to perform division
    }
}
