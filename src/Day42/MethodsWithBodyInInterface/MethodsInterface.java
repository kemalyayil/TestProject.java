package Day42.MethodsWithBodyInInterface;

public interface MethodsInterface {

   // void methodWithBody(){}   // normal de bu sekilde body si olan method olmuyordu. yeni gelen ozellikle default yazip method u olusturabiliyrouz

    default void methodWithBody(){      // bu sekilde...

    }
}
