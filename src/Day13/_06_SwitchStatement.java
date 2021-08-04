package Day13;

public class _06_SwitchStatement {

    public static void main(String[] args) {

        int number= 3;

        switch (number){   // that statement will only check for if cases equal one by one. when found, prints it
            case 1 :   // if number  ==1
                System.out.println("The number is 1");
                break;
            case 2 :   // else if number == 2
                System.out.println("The number is 2");
                break;
            case 3 :   // else if number == 3
                System.out.println("The number is 3");
                break;
            default:  // else
                System.out.println("The number is not found");
                break;
                //        if (number == 1){
//            System.out.println("The number is 1");
//        } else if (number == 2) {
//            System.out.println("The number is 2");
//        } else if (number == 3){
//            System.out.println("The number is 3");
//        } else {
//            System.out.println("The number is not found");
//        }
        }

    }
}
