public class BadHoney {

    public static void main(String[] args) {

     badHoney();


    }

    private static void badHoney() {
        System.out.println("That is not honey poo, that´s bad recursion" );
        badHoney();
    }
}
