package aula09;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String n, int i, String s) {
        this.nome = n;
        this.idade = i;
        this.sexo = s;
    }

    protected String getNome() {
        return nome;
    }

    private void setNome(String n) {
        this.nome = n;
    }

    protected int getIdade() {
        return idade;
    }

    private void setIdade(int i) {
        this.idade = i;
    }

    protected String getSexo() {
        return sexo;
    }

    private void setSexo(String s) {
        this.sexo = s;
    }

    public void fazerAniver() {
        setIdade(getIdade() + 1);
    }
}
