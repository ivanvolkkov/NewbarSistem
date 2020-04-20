package company.vanolincikus.models;

public class Waitress {

    public String name;
    public String pinCode;

    public Waitress(String name, String pinCode) {
        this.name = name;
        this.pinCode = pinCode;
    }

    public String toString() {
        return this.name;
    }

}
