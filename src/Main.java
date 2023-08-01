import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int result = 0;

        while(number>0){
            int rem = number % 10;
            result = result * 10 + rem;
            number/=10;
        }
            System.out.println("The palindrome of " + number + " is " + result);
    }
}