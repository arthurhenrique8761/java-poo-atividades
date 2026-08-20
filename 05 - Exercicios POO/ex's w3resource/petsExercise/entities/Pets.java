package entities;

public abstract class Pets {
    
    protected String name;
    protected String specie;
    protected Integer age;

    public Pets(String name, String specie, Integer age) {
        this.name = name;
        this.specie = specie;
        this.age = age;
    }

    public abstract Integer ageInHumanYears(Integer age);

    // getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecie() {
        return this.specie;
    }

    public void setSpecie(String species) {
        this.specie = species;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
