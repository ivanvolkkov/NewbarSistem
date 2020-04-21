package company.vanolincikus.models;


public class Waitress {


   public enum Position {
        FORMER,
        ADMIN
    }

    public String name;
    public String pinCode;
    public Position position;

    public Waitress(String name, String pinCode,Position position) {
        this.name = name;
        this.pinCode = pinCode;
        this.position = position;

    }

    public String toString() {
        return this.name;
    }

}
