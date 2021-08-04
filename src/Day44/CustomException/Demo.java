package Day44.CustomException;

public class Demo {

    public static void main(String[] args) {

        int [] arr ={10,11,12,13,14,15};
        //System.out.println(arr[7]);


        try {
            printArrayElement(arr,14);              // line 17 metot oradan geliyor
        } catch (JavaIsEasyPeasy javaIsEasyPeasy) {
            System.out.println("Java is easy-peasy exception");
        }
    }
    public static void printArrayElement(int [] arr, int index) throws JavaIsEasyPeasy{
        if (index >  arr.length -1){
            throw new JavaIsEasyPeasy();
        }
        System.out.println(arr[index]);
    }


}
