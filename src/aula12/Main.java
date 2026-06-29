package aula12;

public class Main {
    public void main(String[] args) {
        // Animal n = new Animal(); <- Errado!

        Mamifero m = new Mamifero();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();

        m.setPeso(5.70f);
        m.setIdade(8);
        m.setMembros(4);
        m.locomover(); // Correndo
        m.alimentar(); // Mamando
        m.emitirSom(); // Som de Mamífero

        c.setPeso(55.30f);
        c.setIdade(3);
        c.setMembros(4);
        c.setCorPelo("Marrom");
        c.locomover(); // Pulando
        c.alimentar(); // Mamando
        c.emitirSom(); // Som de Mamífero
        c.usarBolsa();

        k.setPeso(3.94f);
        k.setIdade(5);
        k.setMembros(4);
        c.setCorPelo("Branco");
        k.locomover(); // Correndo
        k.alimentar(); // Mamando
        k.emitirSom(); // Auauau
        k.enterrarOsso();
        k.abanarRabo();
    }
}
