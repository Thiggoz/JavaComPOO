package exemploPraticoComObjetos;

public class Banco {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Métodos especiais
    public Banco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void setNumConta(int n) {
        numConta = n;
    }

    public int getNumConta(){
        return this.numConta;
    }

    public void setTipo(String t) {
        tipo = t;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setDono(String d) {
        dono = d;
    }

    public String getDono() {
        return this.dono;
    }

    public void setSaldo(float s) {
        saldo = s;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setStatus(boolean st) {
        status = st;
    }

    public boolean getStatus() {
        return this.status;
    }

    // Métodos
    public void estadoAtual() {
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (saldo > 0) {
            System.out.println("Conta com crédito!");
        } else if (saldo < 0) {
            System.out.println("Conta em bébito!");
        } else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito de " + v + "R$ realizado com sucesso na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque de " + v + "R$ realizado com sucesso na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente, impossível sacar!");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }

    public void pagarMensal() {
        float v = 0f;
        if (this.getTipo() == "CC") {
            v = 12f;
        } else if (this.getTipo() == "Cp") {
            v = 20f;
        }

        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossível pagar, conta fechada!");
        }
    }
}
