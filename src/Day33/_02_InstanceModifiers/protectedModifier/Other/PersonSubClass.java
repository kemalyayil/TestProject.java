package Day33._02_InstanceModifiers.protectedModifier.Other;

import Day33._02_InstanceModifiers.protectedModifier.Same.Person;

public class PersonSubClass extends Person {   // extends kelimesini kullanarak subFolder yapiyoruz

    public static void main(String[] args) {

        PersonSubClass person = new PersonSubClass();       // burada SubClass ifadesini ekleyip "Same" paketindeki "Person"
        System.out.println(person.name);                    // classini cagirabiliyoruz. "extends" kelimesi onemli Line 5.
        System.out.println(person.getName());



    }


}
