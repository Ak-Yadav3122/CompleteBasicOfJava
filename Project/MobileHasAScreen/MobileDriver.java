package MobileHasAScreen;

public class MobileDriver {
    public static void main(String[] args) {
        Screen s1 = new Screen("15cm",34,"GorelaGlass");
        s1.ScreeenInfo();
        

        System.out.println("++++++++++++++++++++++ By Using Aggreagation ++++++++++++++++++++");
        Screen s2 = new Screen("18cm", 45, "GorelaGlass");
        Mobile m2 = new Mobile("Sumsung",10999,"112g","Blue","120px",s2);
        m2.MobileInfo();
        m2.s2.ScreeenInfo();
    }
}
