public class ComparaçãoString {
    public static void main(String[] args) {
        String nome1 = "Sidnei";
        String nome2 = "Sidnei";
        String nome3 = new  String("Sidnei");
        String res;
        res = (nome1.equals(nome3))?"igual":"diferente";  // mesmo sendo o mesmo nome, sem o metodo '.equals' ele printa 'diferente' na tela
        /*res = (nome1==nome2)?"igual":"diferente";  // variavel 'res' vai receber 'igual' ou  'diferente// '*/
        System.out.println(res);;


    }
}
