package ExercicioDePOO_BancoDePraca;

public class Banco implements BancoUsos {
    // Atributos
    private String modelo;
    private String material;
    private int qntPessoas;
    private String qualidade;
    private String empresa;
    private int capacidade;

    // Métodos Especiais
    public Banco(String modelo, String material, int capacidade, int qntPessoas, String qualidade, String empresa) {
        this.modelo = modelo;
        this.material = material;
        this.capacidade = capacidade;
        this.qntPessoas = qntPessoas;
        this.qualidade = qualidade;
        this.empresa = empresa;
    }

    private String getModelo() {
        return modelo;
    }

    private void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private String getMaterial() {
        return material;
    }

    private void setMaterial(String material) {
        this.material = material;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapaciade(int capaciade) {
        this.capacidade = capaciade;
    }

    private int getQntPessoas() {
        return qntPessoas;
    }

    private void setQntPessoas(int qntPessoas) {
        this.qntPessoas = qntPessoas;
    }

    private String getQualidade() {
        return qualidade;
    }

    private void setQualidade(String qualidade) {
        this.qualidade = qualidade;
    }

    private String getEmpresa() {
        return empresa;
    }

    private void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void descricaoDoBanco() {
        System.out.printf("""
                --- Descrição do Banco ---
                Modelo: %s
                Material: %s
                Capacidade Máxima: %d pessoas
                Espaços Ocupados: %d
                Qualidade: %s
                Fabricante: %s
                --------------------------
                """, getModelo(), getMaterial(), getCapacidade(),getQntPessoas(), getQualidade(), getEmpresa());
    }

    private boolean possivelSentar() {
        return getQntPessoas() < getCapacidade();
    }

    private boolean possivelLevantar() {
        return getQntPessoas() > getCapacidade();
    }

    @Override
    public void sentar() {
        if (this.qntPessoas < this.capacidade) {
            this.qntPessoas++;
            System.out.println("Mais uma pessoa sentou no banco.");
        } else {
            System.out.println("O banco está lotado! Não dá para sentar.");
        }
    }

    @Override
    public void levantar() {
        if (this.qntPessoas > 0) {
            this.qntPessoas--;
            System.out.println("Uma pessoa se levantou do banco.");
        } else {
            System.out.println("O banco já está vazio, não tem ninguém para levantar.");
        }
    }
}
