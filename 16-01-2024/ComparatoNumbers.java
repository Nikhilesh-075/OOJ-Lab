import java.util.Arrays;
public class ComparatoNumbers {
    public static void main(String[] args) {
        String[] numbers = {"10", "9", "8", "7", "6", "5", "4", "3", "2", "1"};
        Arrays.sort(numbers);
        System.out.println("Sorted Numbers:");
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
