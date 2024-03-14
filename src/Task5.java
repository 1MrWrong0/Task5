import java.util.Random;

public class Task5 {
    public static void main(String[] args) {

            int smallest = Integer.MAX_VALUE;
            int largest = Integer.MIN_VALUE;


            int count = 0;
            Random random = new Random();
            while (count < 10) {
                int randomNumber = random.nextInt(100) + 1;
                if (randomNumber < smallest) {
                    smallest = randomNumber;
                }
                if (randomNumber > largest) {
                    largest = randomNumber;
                }
                count++;
            }


            System.out.println("Smallest number: " + smallest);
            System.out.println("Largest number: " + largest);
        }
    }


