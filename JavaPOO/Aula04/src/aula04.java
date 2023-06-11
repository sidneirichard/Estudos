public class aula04 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Sidnei");
        p1.abrirConta("cc");
        p1.depositar(500);
        p1.sacar(400);
        p1.estadoAtual();


        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Richard");
        p2.abrirConta("CP");
        p2.depositar(600);
        p2.sacar(200);
        p2.estadoAtual();



    }
}
