package aula10;

public class Main {
    static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Adão");
        p2.setNome("Jacó");
        p3.setNome("Creuza");
        p4.setNome("Vinagre");

        p1.setIdade(24);
        p2.setIdade(19);
        p3.setIdade(34);
        p4.setIdade(44);

        p1.setSexo("Masculino");
        p2.setSexo("Masculino");
        p3.setSexo("Feminino");
        p4.setSexo("Masculino");

        p2.setCurso("Direito");
        p3.setSalario(2500.50f);
        p4.setSetor("Plantação");

        p2.cancelarMatricula();
        p3.receberAumento(400.34f);
        p4.mudarTrabalho("Analista");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
