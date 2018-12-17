package eu.georgiospapadopoulos;

/*
Challenge info:
A perfect number is a positive integer which is equal to the sum of its proper divisors.
Proper positive divisors are positive integers that fully divide the perfect number
without leaving a remainder and exlude the number itself.
Write a method named isPerfectNumber with one parameter of type int named number.
If the number is less than 1 return false.
The method must then calculate if the number is perfect and return the result.

 */
public class Main {
    public static void main(String[] args) {

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }
    /**
     * Receives a number and checks if it is perfect or not
     * @param number (int)
     * @return true if perfect, false if not or if number is 0 or less.
     */
    private static boolean isPerfectNumber(int number) {
        if (number < 1)
            return false;
        int factorsSum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                factorsSum += i;
        }

        if (factorsSum == number)
            return true;

        return false;
    }
}
