public class OperadoresLogicos {
    public static void main(String[] args) {
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        /*r = (x<y || y==z)?true:false;*/  // nesse caso printa true pq x é menor que y 'OU' y é igual a z  (|| operador logico 'OU')//
        /*r = (x<y && y<z)?true:false;*/  // nesse caso x é menor que y 'E' y é menor que z  (&& operador logico 'E')//
        r = (x<y ^ y<z)?true:false;  // nesse caso é mostrado 'false' pq x é menor que y e y tbm é menor que z, nao sendo exclusivos  (^ operador logico 'EXCLUSIVO')//
        System.out.println(r);
    }
}
