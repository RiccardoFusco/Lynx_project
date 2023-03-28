public class App {
    public static void main(String[] args) throws Exception {
        Arm armDx = new Pistola("mano destra");

        // Pistola pistola = new Pistola("mano destra");
        // Arm pistolaDowncasted = (Arm) pistola;

        

        Arm armSx = new Pugni("mano sinistra");
        

        Legs legs = new Legs();
        Wade wade = new Wade(armDx, armSx, legs);
        wade.muovitiInAvanti();
        wade.scivolata();
        wade.attacca();
        wade.spaccataInAria();
        wade.muovitiIndietro();
        
    }



    public static void attacco2(String[] args) throws Exception {
        Arm armDx = new Katana("mano destra");

        // Pistola pistola = new Pistola("mano destra");
        // Arm pistolaDowncasted = (Arm) pistola;

        

        Arm armSx = new Pugni("mano sinistra");
        

        Legs legs = new Legs();
        Wade wade = new Wade(armDx, armSx, legs);
        wade.muovitiInAvanti();
        wade.scivolata();
        wade.attacca();
        wade.spaccataInAria();
        wade.muovitiIndietro();
        
    }
}
