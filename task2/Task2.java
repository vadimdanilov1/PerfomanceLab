import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {


        File file = new File("array.txt");
        Scanner scanner = new Scanner(file);
        List<Integer> numbers = new ArrayList<>();
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            } else {
                scanner.next();
            }
        }
//        System.out.println(numbers);

//        int[] arr = new int[numbers.size()];
        Integer[] arr = numbers.toArray(new Integer[0]);

        /////////////////////////////////////////////////////////////////////
//        arr = {1, 10, 2, 9};
//        System.out.println(Arrays.toString(arr));
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        double average = sum / arr.length;
//        System.out.println(average);

        double min = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i] - average) < min) {
                min = Math.abs(arr[i] - average);
                minIndex = i;
            }
        }

//        System.out.println(min);
//        System.out.println(arr[minIndex]);
        int number = arr[minIndex];

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < number) {
                while (arr[i] != number) {
                    arr[i]++;
                    count++;
                }
            } else if (arr[i] > number) {
                while (arr[i] != number) {
                    arr[i]--;
                    count++;
                }
            }

        }

        System.out.println(count);


    }
}