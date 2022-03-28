public class Car {
    int horsePower;
    String color;
    String brandName;
    int price;
//    double price;

    void setCar(int hp) {
        this.horsePower = hp;
    }

    void setCar(String color, String brandName) {
        this.color = color;
        this.brandName = brandName;
    }


//    void setCar(int price) {
//      //will alert error
//    }
void showMyCar() {
    System.out.println("My car's brand is " + this.brandName);
    System.out.println("My car's horsepower is " + this.horsePower);
    System.out.println("My car's color is " + this.color);
    System.out.println("My car's price is " + this.price);
}
}
