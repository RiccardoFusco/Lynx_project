public class Pugni extends Arm {

    public Pugni(String side) {
        super(side);
    }
    

    @Override
    public void attacca(){
        System.out.println("Pugno ai O_o con la " + this.side + "!");
    }
}
