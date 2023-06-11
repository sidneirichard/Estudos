public class ComparacaoString {
    public static void main(String[] args) {
        String nome1 = "Sidnei";
        String nome2 = "Sidnei";
        String nome3 = new String("Sidnei");
        String res;
        res = (nome1.equals(nome3))?"igual":"diferente";  // nesse caso nom1 so é igual a nome3 pelo uso do metodo 'equals'//
        /*res = (nome1==nome2)?"igual":"diferente";  // nesse caso nome1 'é igual' a nome2   '==' //*/
        System.out.println(res);
    }
}
