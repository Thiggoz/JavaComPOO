package aula09;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "Livro{" +
                "\nTítulo: " + getTitulo() +
                "\nAutor: " + getAutor() +
                "\nTotal de Páginas: " + getTotPaginas() +
                "\nPágina Atual: " + getPagAtual() +
                "\nEstá aberto? " + getAberto() +
                "\nLeitor: " + getLeitor().getNome() +
                "\nIdade do Leitor: " + getLeitor().getIdade() +
                "\nSexo do Leitor: " + getLeitor().getSexo() + '}';

    }

    public Livro(String t, String a, int tp, Pessoa l) {
        this.titulo = t;
        this.autor = a;
        this.totPaginas = tp;
        this.aberto = true;
        this.pagAtual = 0;
        this.leitor = l;
    }

    private String getTitulo() {
        return titulo;
    }

    private void setTitulo(String t) {
        this.titulo = t;
    }

    private String getAutor() {
        return autor;
    }

    private void setAutor(String a) {
        this.autor = a;
    }

    private int getTotPaginas() {
        return totPaginas;
    }

    private void setTotPaginas(int tp) {
        this.totPaginas = tp;
    }

    private int getPagAtual() {
        return pagAtual;
    }

    private void setPagAtual(int pa) {
        this.pagAtual = pa;
    }

    private boolean getAberto() {
        return aberto;
    }

    private void setAberto(boolean a) {
        this.aberto = a;
    }

    private Pessoa getLeitor() {
        return leitor;
    }

    private void setLeitor(Pessoa l) {
        this.leitor = l;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPaginas || p < 0) {
            this.pagAtual = 0;
        } else {
            this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}
