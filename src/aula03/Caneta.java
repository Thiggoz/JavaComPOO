package aula03;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status() {
        System.out.print("Uma caneta do tipo " + this.modelo + ", da cor " + this.cor + ", ");
        System.out.print("incluindo uma ponta " + this.ponta + ", ");
        if (this.tampada) {
            System.out.print("Tamapada, ");
        } else{
            System.out.print("Destampada, ");
        }
        System.out.println("com " + this.carga + "% de carga.");
    }

    protected void rabiscar() {
        if (this.tampada) {
            System.out.println("ERRO! A caneta está tampada, impossível rabiscar.");
        } else {
            System.out.println("Rabiscando...");
        }
    }

    protected void tampar() {
        this.tampada = true;
    }

    protected void destampar() {
        this.tampada = false;
    }
}
