public class Wade {
    private Arm armDx;
    private Arm armSx;
    private Legs legs;

    public Wade(Arm armDx, Arm armSx, Legs legs) {
        this.armDx = armDx;
        this.armSx = armSx;
        this.legs = legs;

        
    }

    public void attacca(){
        this.armDx.attacca();
        this.armSx.attacca();
        this.armDx.attacca();
        this.armSx.attacca();
   


    }


    public void muovitiInAvanti(){
        this.legs.muovitiInAvanti();

    }

    public void muovitiIndietro(){
        this.legs.muovitiIndietro();

    }


    public void scivolata(){
        this.legs.scivolata();

    }

    public void spaccataInAria(){
        this.legs.spaccataInAria();

    }
}
