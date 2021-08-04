package Homework;

public class Odev16JavaStringsMethod2 {
    public static void main(String[] args) {
    String fruit = "apple";
        System.out.println(fruit.contains("app"));

    String streetName = "Florida";
        System.out.println(streetName.indexOf("o"));

    String gracias = "Thank you";
        System.out.println(gracias.indexOf("y"));

    String animal = "Mouse";
    char index3 = animal.charAt(3);
        System.out.println(index3);

    String firstPlace = "Campus";
        System.out.println(firstPlace.startsWith("C"));

    String lesson = "Java Course";
        System.out.println(lesson.endsWith("e"));

    String openingSentence = "Java is one of the most popular programming language in the world!!!";
        System.out.println(openingSentence.length());

    String one = "My";
    String two = "name is";
    String three= " Kemal";
        System.out.println(one.concat(two).concat(three));

    String target = "I will be a great Software Development Engineer in Test!";
        System.out.println(target.lastIndexOf("e"));

    String app = "Spotify";
        System.out.println(app.isEmpty());
    }
}
