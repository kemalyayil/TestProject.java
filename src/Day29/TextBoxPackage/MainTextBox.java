package Day29.TextBoxPackage;

public class MainTextBox {

    public static void main(String[] args) {

        TextBox box1 = new TextBox();

        System.out.println("Before setText() method: " + box1.text);
        box1.setText("Java is best programming language!");
        System.out.println("After setText() method: " +  box1.text.toUpperCase());

        System.out.println("Length of our TextBox: " + box1.length());



        TextBox box2 = new TextBox();

        box2.setText("Software Development Engineer in Test");

        System.out.println("Before using clear() method: " + box2.text);
        box2.clear();
        System.out.println("After using clear() method: " + box2.text);

    }

}