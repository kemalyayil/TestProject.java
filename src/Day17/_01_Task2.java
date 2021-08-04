package Day17;

public class _01_Task2 {
    public static void main(String[] args) {
        //*
        //**
        //***
        //****

       for ( int i = 0;i< 4; i++){
            for (int j = 0; j <= i; j++) {  // buraya = koymazsak ilkini basmiyor
                                            // calisma sekli, 1. iteration gelince 1 *, ikinci 2*
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
