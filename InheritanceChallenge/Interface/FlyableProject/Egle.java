package InheritanceChallenge.Interface.FlyableProject;

public class Egle extends Bird{
    protected Egle() {
        super("marcoBreed");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying...");
    }
}
