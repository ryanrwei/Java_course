package abstractExample;

class Pig extends Animal {
    Pig(int age) {
        super(age);
    }

    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}
//class Cat extends Animal{
//    public void animalSound() {
//        System.out.println("The pig says: meow meow");
//    }
//}

public class AbstractExampleMain {
    public static void main(String[] args) {
        //    Animal myObj = new Animal(); / will generate an error
        Pig piggy = new Pig(10);
        piggy.animalSound();
        piggy.sleep();
        System.out.println(piggy.age);

//        Cat kitty = new Cat();
//        kitty.animalSound();
//        kitty.sleep();
    }
}
