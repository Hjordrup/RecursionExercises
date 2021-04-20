import java.util.Scanner;

public class TowersOfHanoi {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of disk");
        int n = sc.nextInt();


        System.out.println("The moves are ");
        moveDisk(n, 'A', 'B', 'C');
    }

    private static void moveDisk(int n, char fromTower, char toTower, char auxTower) {

        if(n == 1 ) System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
        else {
            moveDisk(n-1,fromTower,auxTower, toTower);
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
            moveDisk(n-1, auxTower, toTower, fromTower);
        }
    }
}
