package aula11;

public class Main {
    public void main(String[] args) {
        Visitante v1 = new Visitante();

        v1.setNome("José");
        v1.setSexo("Masculino");
        v1.setIdade(12);

        // System.out.println(v1.toString());

        Aluno n1 = new Aluno();

        n1.setNome("Adão");
        n1.setSexo("Masculino");
        n1.setIdade(21);
        n1.setCurso("Japonês");
        n1.setMatricula(10023453);

        // System.out.println(n1.toString());
        // n1.pagarMensalidade();

        Bolsista b1 = new Bolsista();

        b1.setBolsa(12.4f);
        b1.setNome("Luana");
        b1.setIdade(23);
        b1.setCurso("Eng. De Processos");
        b1.setSexo("Feminino");
        b1.setMatricula(40034413);

        // b1.pagarMensalidade();
        // b1.renovarBolsa();

        Professor p1 = new Professor();

        p1.setEspecialidade("Médico");
        p1.setSalario(34400.24f);
        p1.setNome("Irineu");
        p1.setIdade(35);
        p1.setSexo("Masculino");

        p1.receberAumento();
        p1.fazerAniversario();
        System.out.println(p1.toString());
    }
}
