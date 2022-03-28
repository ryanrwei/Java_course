public class Magician extends Role {
    protected void print(){
        System.out.println("print");
    }

    public void print2(){
        System.out.println("print");
    }


    Magician(int roleHP, int roleMP, int roleATTACK) {
        super(roleHP,roleMP,roleATTACK);

    }

}
