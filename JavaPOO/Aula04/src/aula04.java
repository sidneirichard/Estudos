public class aula04 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Sidnei");
        p1.abrirConta("cc");
        p1.depositar(500);
        p1.estadoAtual();



    }
}
