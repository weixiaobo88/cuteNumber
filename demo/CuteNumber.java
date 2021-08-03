package demo;

import java.util.Arrays;

public class CuteNumber {
    public Boolean checkCuteNumber(int[] numbers) {
        int[] evenNumbers = findEvenNumbers(numbers);
        int largestEvenNumber = findLargestNumber(evenNumbers);

        return isGreaterThan10(largestEvenNumber);
    }

    private int[] findEvenNumbers(int[] numbers) {
        int[] evenNumbers = new int[numbers.length];
        int evenNumberIndex = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers[evenNumberIndex++] = number;
            }
        }

        final int[] result = Arrays.copyOfRange(evenNumbers, 0, evenNumberIndex);
        System.out.println(Arrays.toString(evenNumbers));
        return result;
    }

    private int findLargestNumber(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    private Boolean isGreaterThan10(int largestEvenNumber) {
        return largestEvenNumber > 10;
    }
}
