public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Maria",22,"F");
        p[1] = new Pessoa("Richard", 34,"M");

        l[0] = new Livro("Java para iniciantes","José da Silva",300,p[0]);
        l[1] = new Livro("PoO para Burros","Chaves",500,p[1]);
        l[2] = new Livro("Java Avançado","Maria Candida",800,p[1]);


        l[0].abrir();
        l[0].folhear(260);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
    }
}
