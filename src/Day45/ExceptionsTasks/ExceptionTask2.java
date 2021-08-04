package Day45.ExceptionsTasks;

public class ExceptionTask2 {
    /**
     create a static method that accepts string as parameter
     try to get first letter of the string and return it
     handle all possible exceptions
     */


    public static void main(String[] args) {
        getTheFirstCharacter("");           // This is an empty String!! (Handled Exception)

        getTheFirstCharacter(null);         // This is a null String! (Handled Exception)

        System.out.println(getTheFirstCharacter("Techno"));     // T
    }


    public static Character getTheFirstCharacter (String input){
         try {
             return input.charAt(0);
         }catch (StringIndexOutOfBoundsException ex){
             System.out.println("This is an empty String!!");
             return '0';
         }catch (NullPointerException ex){
             System.out.println("This is a null String!");
             return '0';
         }

    }
}
