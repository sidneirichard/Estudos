public class aula10 {
    public static void main(String[] args) {
        // Animal n = new Animal() ; Animal é uma classe abstrata e não pode ser instanciada //
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra s = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara e = new Arara();

        c.locomover();
        k.emitirSom();

    }
}
