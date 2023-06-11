public class aula09 {
    public static void main(String[] args) {
       // Pessoa p1 = new Pessoa() {//
        /*Visitante v1 = new Visitante();
        v1.setNome("Richard");
        v1.setIdade(34);
        v1.setSexo("M");
        System.out.println(v1.toString());
        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setSexo("M");
        a1.pagarMensalidade();
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Sidnei");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();*/
        Professor p1 = new Professor("Jair",2550.65f);
        p1.setNome("Jair");
        p1.setSalario(2500.65f);
        p1.setSexo("M");
        p1.setEspecialidade("Java");
        p1.receberAumento(550f);



        }
}
