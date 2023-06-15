public class TestTriangle {
    public static void main(String[] args) {
        int x = 0;
        Triangle[] ta = new Triangle[4];  // 4 espaços alocados na memoria para criar objetos 'Triangle'
        while (x < 4) {
            ta[x] = new Triangle();  // Objeto 'Triangle'
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;
            ta[x].setArea();
            System.out.print("triangle " + x + ", area");
            System.out.println(" = " + ta[x].area);
            x++;
        }
        int y = x;
        x = 27;
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", t5  area = " + t5.area);
    }
}
