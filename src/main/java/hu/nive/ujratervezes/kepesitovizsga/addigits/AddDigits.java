package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {

    public static final String NUMBERS = "0123456789";

    public int addDigits(String input) {
        if (input == null || input.isBlank()) {
            return -1;
        }
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            String currentNumberAsString = input.substring(i, i + 1);
            if (NUMBERS.contains(currentNumberAsString)) {
                counter += Integer.parseInt(currentNumberAsString);
            }
        }
        return counter;
    }
}
