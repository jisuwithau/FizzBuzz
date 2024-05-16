/**
 * Solve the FizzBuzz challenge.
 * #1 and == &&
 * #2 for (...){}
 * #3 no indentation in for loop, instead uses {}
 * #4 put variable type in front of the variable name
 * #5 put "public static void" in front of the methods
 * #6 System.out.println("Fizz") instead of print()
 * #7 i++ instead of i =+ 1
 */
class FizzBuzz {

    public static void main(String[] args) {

        int i = 1;
        while (i < 100) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {

                System.out.println("Fizz Buzz");

            } else if (divisibleBy3) {

                System.out.println("Fizz");

            } else if (divisibleBy5) {

                System.out.println("Buzz");

            } else {

                System.out.println(i);

            }
            i++;
        }
    }
}
