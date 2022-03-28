package InterfaceExample;

interface FirstInterface {
    String FirstText = "HI first";

    public void myMethod(); // interface method
}

interface SecondInterface {
    String SecondText = "HI Second";

    public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("First text.." + this.FirstText);
    }

    public void myOtherMethod() {
        System.out.println("Second text..."+ this.SecondText);
    }
}

class MultipleImplement {
    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();
        System.out.println("Second text..."+ myObj.SecondText);
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}