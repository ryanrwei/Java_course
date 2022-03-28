public class Human {
    double weight; //data member
    double height; //data member
    int age; //data member
    String name; //data member

/*
constructor 之間用 this 來互相 call，比如 constructor 1 就用 this(32) 來 call constructor 2，
其中他是靠 this 傳入的值來判斷用哪個 constructor (overlapping的觀念)
*/

    // constructor 1
    Human(String humanName) {
        this(32);
        name = humanName;
    }

    // constructor 2
    private Human(int humanAge) { //私有建構元
        age = humanAge;
    }

    // constructor 3
    Human(double humanWeight, double humanHeight) {
        weight = humanWeight;
        height = humanHeight;
    }


    int getAge() {
        //method member
        return this.age; //this 指向此類別本身
    }

    String getMyName() {
        return this.name; //this 指向此類別本身
    }

    void ShoutMyName() {
        //method member
        System.out.println("MY NAME IS " + getMyName().toUpperCase() + "!!!!!!!!!!!"); //於類別內呼叫getMyName函數
    }

    double calcBMI() {
        //method member
        double prefixHeight = this.height / 100;
        return this.weight / Math.pow(prefixHeight, 2);  //about Math.pow() https://www.educative.io/edpresso/how-to-use-the-mathpow-method-in-java
    }
}
