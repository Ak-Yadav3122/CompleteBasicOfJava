package MobileHasAScreen;

public class Screen {

    String size;
    int pixels;
    String glass;
    Mobile m1 = new Mobile("Oppo", 12999,"56g", "Red", "45px");

    Screen() {

    }

    Screen(String size, int pixels, String glass) {
        this.size = size;
        this.pixels = pixels;
        this.glass = glass;
    }

    public void ScreeenInfo() {
        m1.MobileInfo();
        System.out.println("The Screen size are: " + size);
        System.out.println("The Screen pixels are: " + pixels);
        System.out.println("The Screen glass are: " + glass);

    }

}
