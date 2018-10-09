import java.util.Scanner;
import java.lang.*;
public class Main {

    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("First number");
            int firstNumber = in.nextInt();
            System.out.println("Second number");
            int secondNumber = in.nextInt();
            if ((firstNumber >= 13 && firstNumber <= 19) != (secondNumber >= 13 && secondNumber <= 19)) {
                System.out.println("teen");
            }

        }
        }
