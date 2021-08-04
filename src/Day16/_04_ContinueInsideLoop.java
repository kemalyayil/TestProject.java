package Day16;

public class _04_ContinueInsideLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            if (i == 5){
                continue; // print ederken 5 i skip etti
            }

            System.out.println(i);

        }
    }
}
