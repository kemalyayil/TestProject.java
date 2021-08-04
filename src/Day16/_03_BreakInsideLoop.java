package Day16;

public class _03_BreakInsideLoop {
    public static void main(String[] args) {
        int count = 0;

        while (count < 10){
            count++;
            System.out.println(count);

            if (count == 5) {
                break; // when count = 5 this loop will stop because of the break keyword
            }
        }

        System.out.println(" ");

        for (int i = 0; i < 10; i++){
            System.out.println(i);

            if (i == 5){
                break; // when count = 5 this loop will stop because of the break keyword
            }
        }
        }
    }

