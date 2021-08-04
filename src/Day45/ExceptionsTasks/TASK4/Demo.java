package Day45.ExceptionsTasks.TASK4;

public class Demo {
    public static void main(String[] args) {

        try {
            throwException();
        } catch (ExceptionTask4 exceptionTask4) {
            exceptionTask4.printStackTrace();
        }

    }


    public static void throwException() throws ExceptionTask4{
        throw new ExceptionTask4();
    }


}
