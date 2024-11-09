package addition.example;

public class Addition {
    //declare method to perform addition
    public void add() {
//declare variables with value
        int a = 456;
        int b = 562;
        int sum =a+b;
        //print output
        System.out.println("ADDITION OF TWO NUMBERS:" +sum);
    }

    //Main method to execute the program
    public static void main(String[] args) {
        Addition get = new Addition();
//create object for class
        get.add();
//calling add method to perform addition
    }
}
