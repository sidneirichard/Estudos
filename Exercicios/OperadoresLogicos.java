public class OperadoresLogicos {
    public static void main(String[] args) {
        int x, y, z;
        x = 14;
        y = 17;
        z = 112;
        boolean r;
        r = (x<y && y<z)?true:false; // nesse caso x é menor que y 'E' y é menor que z  (&& operador logico 'E')//s
        System.out.println(r);
    }
}
