package InheritanceChallenge.Interface.FlyableProject;

public abstract class Bird implements Flyable{
    private final String breed;

    protected Bird(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
