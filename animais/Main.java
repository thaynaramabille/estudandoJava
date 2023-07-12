import ave.Passaro;
import mamiferos.Cachorro;
public class Main {
    public static void main(String[] args) {
        Passaro passaro1 = new Passaro(2, 0.70f, "Marcelo");
        Passaro passaro2 = new Passaro(2, 0.60f, "Lulu");
        passaro2.voar();
        Cachorro cachorro1 = new Cachorro(2, 30.0f, "Alfredo");
        cachorro1.latir();
    }
}
