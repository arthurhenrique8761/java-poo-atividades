package entities;

public class Dog extends Pets {

    private String favoriteToy;

    public Dog(String name, String specie, Integer age, String favoriteToy) {
        super(name, specie, age);
        this.favoriteToy = favoriteToy;
    }

    public Integer ageInHumanYears(Integer age) {
        return (age * 5);
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nSpecie: %s\nAge: %d\nFavorite Toy: %s\nin Human Years: %d", name, specie, age, favoriteToy, ageInHumanYears(age));
    }

    public String getFavoriteToy() {
        return this.favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }
}
