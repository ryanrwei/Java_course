/*
https://www.baeldung.com/java-access-modifiers

default、Protected 差別:

1. default: The default access modifier is also called package-private,
which means that all members are visible within the same package but aren't accessible from other packages
只能給同一個package用

2. Protected: we can access the member from the same package (as with package-private access level) and
in addition from all subclasses of its class, even if they lie in other packages
可以給同一個package用，也可以給其他package用，但需要import

*/
public class Class_ex4 {
    static{System.out.println("static block is invoked");}
    public static void main(String[] args) {
        Human Henry = new Human("Henry");
        System.out.println("initially Henry is  " + Henry.getAge() + " years old");

        // set the value to data member
        Henry.age = 18;
        Henry.height = 168.3;
        Henry.weight = 48.6;
        // call the method member
        Henry.ShoutMyName();
        System.out.println("I am " + Henry.getAge() + " years old");
        System.out.println("Wow my BMI is " + Henry.calcBMI());
        System.out.println("==================================");

        Human Frank = new Human(70.0, 176);
        // set the value to data member
        Frank.age = 18;
        Frank.name = "Frank";
        // call the method member
        Frank.ShoutMyName();
        System.out.println("I am " + Frank.getAge() + " years old");
        System.out.println("Wow my BMI is " + Frank.calcBMI());
        System.out.println("==================================");



    }
}
