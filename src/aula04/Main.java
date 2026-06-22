package aula04;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "Verde", 0.5f);
        Caneta c2 = new Caneta("BIC Cristal", "Azul", 1.5f);
        Caneta c3 = new Caneta("Stabilo", "Laranja", 0.9f);
        c1.status();
        c2.status();
        c3.status();
    }
}