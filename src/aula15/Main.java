package aula15;

public class Main {
    public static void main(String[] args) {
        Video[] v = new Video[3];
        int tamanho = v.length;
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Domando camelo no Minecraft");
        v[2] = new Video("Quando sai a temporada 3 de Naruto");


        Gafanhoto[] g = new Gafanhoto[3];
        g[0] = new Gafanhoto("Adão", 23, 'M', "PeidoQuente");
        g[1] = new Gafanhoto("Vanessa", 16, 'F', "Chafariz");
        g[2] = new Gafanhoto("Thiago", 26, 'M', "ChaveEscola");

        /*
        for (int i = 0; i < tamanho; i++) {
            System.out.println(v[i].toString());
            System.out.println(g[i].toString());
        }
        */

        Visualizacao[] vis = new Visualizacao[3];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[1].avaliar(87.0f);
        System.out.println(vis[1].toString());
    }
}
