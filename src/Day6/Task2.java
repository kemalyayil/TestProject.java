package Day6;

public class Task2 {
    public static void main(String[] args) {

// part1: find the index of 4 in "0.12345678"
// part2: find the index of . in "0.12345678"

        String x = "0.12345678";
        int indexOfX = x.indexOf("4");
        int indexOfX2= x.indexOf(".");
        System.out.println(indexOfX + "\n" + indexOfX2);


    }
}
