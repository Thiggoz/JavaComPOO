package aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.print("Uma caneta do tipo " + this.modelo + ", da cor " + this.cor + ", ");
        System.out.print("incluindo uma ponta " + this.ponta + ", ");
        if (this.tampada) {
            System.out.print("Tamapada, ");
        } else{
            System.out.print("Destampada, ");
        }
        System.out.println("com " + this.carga + "% de carga.");
    }

    void rabiscar() {
        if (this.tampada) {
            System.out.println("ERRO! A caneta está tampada, impossível rabiscar.");
        } else {
            System.out.println("Rabiscando...");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
