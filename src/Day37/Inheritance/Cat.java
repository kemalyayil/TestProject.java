package Day37.Inheritance;

public class Cat extends Animal{            // cat is child of Animal class

        String nameOfCat;


        public Cat(String name,int age){
            super("Cat" , age);            // super key word to get constructor.Animal class/ line 8.
            this.nameOfCat = name;                   // this key word to get sth in the same class
            //super.name                        // name is in the parent class.

        }
}
