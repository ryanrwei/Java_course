package InterfaceExample;

// Pig "implements" the Animal interface
class Pig implements Animal {

    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }

    @Override    //可忽略因為必須覆寫
    public void animalStep() {
        System.out.println("The pig walk slowly");
    }

    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal(); would throw error
        Pig myPig = new Pig();  // Create a Pig object
        myPig.animalSound();
        myPig.animalStep();
        myPig.sleep();
    }
}