package super_team;

public class Mom implements SuperPower, Outfit, Age, Height, Weight{
    String name;
    String  SuperPower;
    String Outfit;
    String OutfitState;
    int Age;
    int Height;
    int Weight;

    Mom(String name, String  SuperPower, String Outfit, String OutfitState, int Age, int Height, int Weight) {
        this.name = name;
        this.SuperPower = SuperPower;
        this.Outfit = Outfit;
        this.OutfitState = OutfitState;
        this.Age = Age;
        this.Height = Height;
        this.Weight = Weight;
    }


    @Override
    public void ShoutOutSkill() {
//        System.out.println("I'm " + this.name + " who can " + this.SuperPower);
        System.out.println(this.name +"'s SuperPower is " + this.SuperPower);
    }

    @Override
    public void ShoutOutOutfit() {
        System.out.println(this.name + " wears " + this.Outfit);
    }

    public void activateSuperPower() {
        System.out.println(this.name + " activates " + this.SuperPower + " so the Outfit becomes flexible");
    }

    public void dectivateSuperPower() {
        System.out.println(this.name + " dectivates " + this.SuperPower + " so the Outfit becomes inflexible");
    }

    @Override
    public void ShoutOutAge() {
        System.out.println(this.name + " is " + this.Age);
    }

    @Override
    public void ShoutOutHeight() {
        System.out.println(this.name + " is " + this.Height + " cm");
    }

    @Override
    public void ShoutOutWeight() {
        System.out.println(this.name + " is " + this.Weight + " kg");
    }



}
