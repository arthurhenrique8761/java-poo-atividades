package entities;

public class Bird extends Pets {

    private Double wingSpan;

    public Bird(String name, String specie, Integer age, Double wingSpan) {
        super(name, specie, age);
        this.wingSpan = wingSpan;
    }

    public Integer ageInHumanYears(Integer age) {
        return (age * 2);
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nSpecie: %s\nAge: %d\nWingspan: %.2f\nin Human Years: %d", name, specie, age, wingSpan, ageInHumanYears(age));
    }

    public Double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(Double wingSpan) {
        this.wingSpan = wingSpan;
    }
}
