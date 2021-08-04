package Homework.Homework35_Enum_Task1;

public enum Months {


        Jan("January"),
        Feb("February"),
        Mar("March"),
        Apr("April"),
        May("May"),
        Jun("June"),
        Jul("July"),
        Aug("August"),
        Sep("September"),
        Oct("October"),
        Nov("November"),
        Dec("December");

        final String fullName;

        Months(String fullname){
            this.fullName= fullname ;
        }

    }
