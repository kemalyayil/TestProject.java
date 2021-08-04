package Day38.WhatCanBeExtended;

public class Child extends Parent{

    public void instanceMethod(){

        /**

         - CAN ACCESS INSTANCE AND STATIC VARIABLES EXCEPT PRIVATE ONES

         */

        System.out.println(defaultVariable);
        System.out.println(protectedVariable);
        System.out.println(publicVariable);
        System.out.println(finalDefaultVariable);
        System.out.println(finalPublicVariable);
        System.out.println(staticDefaultVariable);
        System.out.println(staticPublicVariable);

//        System.out.println(finalPrivateVariable); - cannot access - private
//        System.out.println(privateVariable); - cannot access - private
//        System.out.println(staticPrivateVariable); - cannot access - private

        defaultMethod();
        publicMethod();
        finalPublicMethod();
        staticPublicMethod();
        staticProtectedMethod();
        protectedMethod();

//        finalPrivateMethod();  - cannot access - private
//        staticPrivateMethod();  - cannot access - private
//        privateMethod();  - cannot access - private

    }

    public static void staticMethod(){

        /**

         - CAN ONLY ACCESS STATIC VARIABLES AND METHODS
         - CANNOT ACCESS INSTANCE VARIABLES AND METHODS

         */

//        System.out.println(defaultVariable);
//        System.out.println(protectedVariable);
//        System.out.println(publicVariable);
//        System.out.println(finalDefaultVariable);
//        System.out.println(finalPublicVariable);
        System.out.println(staticDefaultVariable);
        System.out.println(staticPublicVariable);

//        System.out.println(finalPrivateVariable); - cannot access - private
//        System.out.println(privateVariable); - cannot access - private
//        System.out.println(staticPrivateVariable); - cannot access - private

//        defaultMethod();
//        publicMethod();
//        finalPublicMethod();
        staticPublicMethod();
        staticProtectedMethod();
//        protectedMethod();

//        finalPrivateMethod();  - cannot access - private
//        staticPrivateMethod();  - cannot access - private
//        privateMethod();  - cannot access - private

    }


}