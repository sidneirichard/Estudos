public class ProjetoPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p1.setSexo("M");
        p1.setIdade(18);

        p2.setNome("Maria");
        p2.setSexo("F");
        p2.setIdade(32);
        p2.setCurso("Informática");

        p3.setNome("Cláudio");
        p3.setSexo("M");
        p3.setIdade(17);
        p3.setSalario(2500.74f);

        p4.setNome("Fabiana");
        p4.setSexo("F");
        p4.setIdade(19);
        p4.setSetor("Estoque");

        /*p1.receberAumento(550.50f);
        p2.mudarTrabalho();
        p4.cancelarMat();*/

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
