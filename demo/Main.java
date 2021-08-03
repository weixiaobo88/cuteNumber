package demo;

public class Main {
    public static void main(String[] args) {
        CuteNumber cuteNumber = new CuteNumber();
        int[] numbers = {1, 3, 5, 10, 17, 18};
        Boolean result = cuteNumber.checkCuteNumber(numbers);

        System.out.println(result);
    }
}
