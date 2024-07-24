import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Sortdemo {
    public static void main(String[] args) {
        int min = 1; 
        int max = 100; 
        int count = 10; 
        System.out.println("Generating " + count + " random numbers between " + min + " and " + max + " that are multiples of 10:");

        Random random = new Random();
        List<Integer> multiplesOfTen = new ArrayList<>();
        
        while (multiplesOfTen.size() < count) {
            int randomNumber = random.nextInt(max - min + 1) + min; 
            if (randomNumber % 10 == 0) { 
                multiplesOfTen.add(randomNumber);
            }
        }

        Collections.sort(multiplesOfTen);
        System.out.println("Sorted random numbers (multiples of 10):");
        for (int number : multiplesOfTen) {
            System.out.println(number);
        }
    }
}
