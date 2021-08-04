package Day44.ExceptionTypes;

public class UncheckedException extends Throwable {

    public static void main(String[] args) {
        // Checked exceptions are giving compiler error. Altcizgili oluyor. islem yaptirmiyor. ama unchecked exceptions
        // alt cizgili gorunmuyor, compiler error vermiyor.run ettigimizde  hata veriyor

        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(arr[2]);             // 2'nin yerine 20 yazarsak altini cizmiyor. ama print dedigimizde out of bound
                                                // exception veriyor. boylelikle bizim program is crashed.



        try {
            System.out.println(arr[20]);                // bu sekilde program crash olmuyor ve istedigin mesaji veriyor.
        } catch (Exception ex){
            System.out.println("This index is invalid");
        }


    }
}
