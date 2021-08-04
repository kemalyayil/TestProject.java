package Day16;

public class _06_ForEachLoopIndex {
    public static void main(String[] args) {

//        Will Zeki Muren see us too?

        String[] list = {"fruits", "vegetables", "meat", "milk"};

        for (String element: list){             // burda element print edilir
            if (element.startsWith("m")){
                System.out.println("Line 12 " + element);
            }

        }
        for (int i = 0; i < list.length; i++){  // burda indexini bulduk
            if (list[i].startsWith("m")){
               System.out.println(i); // list[i] yazsaydik icindeki elementleri print edecektik
            }

        }
    }
}
