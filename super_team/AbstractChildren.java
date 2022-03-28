package super_team;

abstract class AbstractChildren {
    String name;
    String  SuperPower;
    String Outfit;
//    String OutfitState;
    int Age;
    int Height;
    int Weight;

    AbstractChildren(String name, String  SuperPower, String Outfit, int Age, int Height, int Weight) {
        this.name = name;
        this.SuperPower = SuperPower;
        this.Outfit = Outfit;
        this.Age = Age;
        this.Height = Height;
        this.Weight = Weight;
    }

    public abstract void ShoutOutSkill();

    public abstract void ShoutOutOutfit();

    public abstract void ShoutOutAge();

    public abstract void ShoutOutHeight();

    public abstract void ShoutOutWeight();

    public void ShoutOutChildren() {
        System.out.println("I am child");
    }

}
