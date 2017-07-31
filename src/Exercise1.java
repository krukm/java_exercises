import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name;

        System.out.println("Please enter your name:");
        name = scan.next();
        System.out.println("Hello, " + name + "!");
    }
}
