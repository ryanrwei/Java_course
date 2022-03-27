package super_team;

public class main {
    public static void main(String[] args) {

        Dad dad = new Dad("Bob", "Incomparable", "StrongSuit", 45, 196, 86);
        dad.ShoutOutSkill();
        dad.ShoutOutOutfit();
        dad.ShoutOutAge();
        dad.ShoutOutHeight();
        dad.ShoutOutWeight();

        Mom mom = new Mom("Helen", "SuperExtend", "FlexibleSuit", "inflexible",42, 165, 45);
        mom.ShoutOutSkill();
        mom.ShoutOutOutfit();
        mom.ShoutOutAge();
        mom.ShoutOutHeight();
        mom.ShoutOutWeight();
        mom.activateSuperPower();
//        mom.dectivateSuperPower();

        Sister sister = new Sister("Violet", "invisible", "InvisibleSuit" , 18, 170, 43);
        sister.ShoutOutSkill();
        sister.ShoutOutOutfit();
        sister.ShoutOutAge();
        sister.ShoutOutHeight();
        sister.ShoutOutWeight();
        sister.ShoutOutChildren();

        OldBrother oldbrother = new OldBrother("Robert ", "Accelerate", "FastSuit" , 15, 160, 50);
        oldbrother.ShoutOutSkill();
        oldbrother.ShoutOutOutfit();
        oldbrother.ShoutOutAge();
        oldbrother.ShoutOutHeight();
        oldbrother.ShoutOutWeight();
        oldbrother.ShoutOutChildren();
        oldbrother.Accelerate();

        YoungBrother youngbrother = new YoungBrother("Jack ", "Transformation", "TransformationSuit" , 5, 120, 20);
        youngbrother.ShoutOutSkill();
        youngbrother.ShoutOutOutfit();
        youngbrother.ShoutOutAge();
        youngbrother.ShoutOutHeight();
        youngbrother.ShoutOutWeight();
        youngbrother.ShoutOutChildren();
        youngbrother.Transformation();





    }
}
