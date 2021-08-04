package Day18;

public class _01_DebuggingJavaApp {
    public static void main(String[] args) {

        /*
        Start
        0
        1
        2
        3
        4
        Finish
         */
        // Run Time error
        System.out.println("Start");
        //for (int i = 0; i < 4; i = i+2){ // burada hata vardi, debug ile adim adim nerde hata oludugunu gorduk
        for (int i = 0; i <= 4; i++){
            System.out.println(i);
        }
        System.out.println("Finish");

    }
}
