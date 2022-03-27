package super_team;

class OldBrother extends AbstractChildren{
    String speed;

    OldBrother(String name, String  SuperPower, String Outfit, int Age, int Height, int Weight) {
        super(name, SuperPower, Outfit, Age, Height, Weight);
    }

    @Override
    public void ShoutOutSkill() {
        System.out.println(this.name +"'s SuperPower is " + this.SuperPower);
    }

    @Override
    public void ShoutOutOutfit() {
        System.out.println(this.name + " wears " + this.Outfit);
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

    public void Accelerate() {
        this.speed = "inf";
        System.out.println(this.name + "'s speed is " + this.speed);
    }

}
