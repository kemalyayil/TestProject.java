package Day34.Enums3;

public enum Directions {

    EAST("E"),
    WEST("W"),
    NORTH("N"),
    SOUTH("S");

    final String shortName ;
    int distance;

    Directions(String shortName){       // contructor oldugunda once initial part oluyordu
        this.shortName= shortName;
    }
}
