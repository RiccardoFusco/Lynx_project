public class Katana extends Arm{
    public Katana(String side){
        super(side);
    }


    @Override
    public void attacca(){
        System.out.println("Ops...scusa bello credo di averti fatto un bel taglio, con bel colpo della mia mano " + this.side);
    };
}

