public class Pistola extends Arm {

    public Pistola(String side) {
        super(side);
    }
    
    @Override
    public void attacca(){
        System.out.println("Ti ho sparato in faccia bello! con il la mia " + this.side + "!");
    }
}
