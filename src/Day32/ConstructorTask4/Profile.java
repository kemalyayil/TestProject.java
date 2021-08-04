package Day32.ConstructorTask4;

public class Profile {

    String firstName;
    String lastName;
    String address;
    String birthDate;
    String phone;
    String email;
    String nickname;

                                    // Constructor chaining  ( line = 24 , 33 )
    //constructor 1
    public Profile(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Constructor 2
    public Profile(String firstName, String lastName, String birthDate) {
//        this.firstName = firstName;
//        this.lastName = lastName;
        this(firstName,lastName);     // constructor 1 dan aldik
        this.birthDate = birthDate;

    }

    //Constructor 3
    public Profile(String firstName, String lastName, String address, String birthDate, String phone, String email, String nickname) {
//        this.firstName = firstName;
//        this.lastName = lastName;
        this(firstName,lastName,birthDate);
        this.address = address;
//        this.birthDate = birthDate;
        this.phone = phone;
        this.email = email;
        this.nickname = nickname;

        // this(firstName,lastName,birthDate);    // bunu ilk satira yazmamiz lazim. her zaman. yoksa hata verir.
    }



    public Profile(String nickname) {
        this.nickname = nickname;
    }
}