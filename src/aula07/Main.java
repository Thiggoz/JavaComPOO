package aula07;

public class Main {
    static void main(String[] args) {
        Lutador[] l = new Lutador[5];

        l[0] = new Lutador("Adão", "Alemanha", 28, 1.96f, 94.3f, 14, 3, 2);
        l[1] = new Lutador("Jasmine", "Inglaterra", 24, 1.75f, 68.5f, 8, 5, 6);
        l[2] = new Lutador("Poatan", "Brasil", 32, 1.97f, 78.4f, 17, 0, 1);
        l[3] = new Lutador("Jonas", "Afeganistão", 47, 2.12f, 113.6f, 9, 3, 7);
        l[4] = new Lutador("Joana", "Espanha", 39, 1.87f, 82.6f, 4, 6, 9);

        for (int i = 0; i < 5; i++) {
            l[i].apresentar();
        }
    }
}
