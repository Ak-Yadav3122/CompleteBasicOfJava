package MobileHasAScreen;

public class Mobile {
    String name;
    int price;
    String weight;
    String color;
    String camera;
    Screen s2;

    Mobile() {
        System.out.println("Mobile details are created");
    }

    Mobile(String name) {
        this.name = name;
    }

    Mobile(String name, int price, String weight, String color, String camera) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.camera = camera;
    }

    Mobile(String name, int price, String weight, String color, String camera, Screen s2) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.camera = camera;
        this.s2 = s2;
    }

    public void MobileInfo() {
        System.out.println("The name of mobile is: " + name);
        System.out.println("The price of mobile is: " + price);
        System.out.println("The weight of mobile is: " + weight);
        System.out.println("The color of mobile is: " + color);
    }
}
