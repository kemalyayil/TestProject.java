package Day29.TextBoxPackage;

public class TextBox {

    String text = ""; // field

    void setText(String text){
        this.text = text;
    }

    void clear(){
        this.text = "";
    }

    // Small TASK
    // Create a method which returns
    // number of Characters in TextBox

    int length(){
        int size = text.length();
        return size;
    }
}
