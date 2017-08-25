public class Factorial {
    //make and test a method that computes a number's factorial

    public static int factorial(int value){
        if (value == 0 || value == 1) {
            return 1;
        } else {
        return value * factorial(value - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(6));
        System.out.println(factorial(7));
    }
}