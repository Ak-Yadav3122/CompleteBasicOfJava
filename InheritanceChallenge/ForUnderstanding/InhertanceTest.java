package InheritanceChallenge.ForUnderstanding;

public class InhertanceTest {
    public static void main(String[] args) {
        Vechile vechile = new Vechile();
        vechile.commute();


        TwoWeeler twoWeeler = new TwoWeeler(2);
        twoWeeler.commute();
        twoWeeler.balance();


        TwoWeeler twoWeelerColor = new TwoWeeler("red");
        twoWeelerColor.color();


        MoterCycle moterCycle = new MoterCycle("blue");
        moterCycle.commute();
        moterCycle.color();
        moterCycle.balance();
    }
}
 