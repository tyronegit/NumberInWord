public class NumberInWord {

    public static void main(String[] args) {

        printNumberInWord (0);
        printNumberInWord (1);
        printNumberInWord (2);
        printNumberInWord (3);
        printNumberInWord (4);
        printNumberInWord (5);
        printNumberInWord (6);
        printNumberInWord (7);
        printNumberInWord (8);
        printNumberInWord (9);
        printNumberInWord (10);
        
    }

    public static void printNumberInWord(int number) {

        String numInWord = "Number not Listed in method 'printNumberInWord'.";
        if (number == 0) {
            numInWord = "ZERO";
        } else if (number == 1) {
            numInWord = "ONE";
        } else if (number == 2) {
            numInWord = "TWO";
        } else if (number == 3) {
            numInWord = "THREE";
        } else if (number == 4) {
            numInWord = "FOUR";
        } else if (number == 5) {
            numInWord = "FIVE";
        } else if (number == 6) {
            numInWord = "SIX";
        } else if (number == 7) {
            numInWord = "SEVEN";
        } else if (number == 8) {
            numInWord = "EIGHT";
        } else if (number == 9) {
            numInWord = "NINE";
        }

        System.out.println (number + " stands for " + numInWord);
    }
}
