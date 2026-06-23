package aula09;

public class Main {
    static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Jacó", 26, "Masculino");
        p[1] = new Pessoa("Joana", 19, "Feminino");

        l[0] = new Livro("Como tomar no cu", "Andressa Urach", 300, p[0]);
        l[1] = new Livro("Game of Thones", "Adão Perneta", 900, p[1]);
        l[2] = new Livro("No Game No Life", "Akasama Negrito", 150, p[0]);

        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());

        System.out.println(l[1].detalhes());
    }
}
