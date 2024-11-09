package multiplication.example;

public class Multiplication {
    //declare method
    public void mul() {
        float a = 4.5f;
        float b = 1.2f;
        float calc=a*b;
//print output
        System.out.println("MULTIPLICATION OF TWO NUMBERS:"+ calc);
    }

    //Main method to execute the program
    public static void main(String[] args) {
        Multiplication get2 = new Multiplication();
//create object for class
        get2.mul();
//calling mul method to perform Multiplication
    }
}

