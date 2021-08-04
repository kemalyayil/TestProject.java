package Day16;

public class _05_ForEachLoopTask {
    // print array with for each loop
    // print lenght of each element
    public static void main(String[] args) {

        String[] list = {"fruits", "vegetables", "meat", "milk"};

        for (String eat : list){

            System.out.println(eat);
            System.out.println(eat.length());
        }
    }

}
