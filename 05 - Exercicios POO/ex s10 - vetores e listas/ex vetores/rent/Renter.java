package entities;

public class Renter {

    private String name;
    private String email;

    public Renter(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //getters
    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }
    
}