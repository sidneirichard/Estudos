public class HobbitsTestDrive {
    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        int z = -1;  // Arrays começam com o elemento '0'
        while (z < 2) {
            z++;
            h[z] = new Hobbits();
            h[z].name = "Bilbo";
            if (z == 1) {
                h[z].name = "Frodo";
            }
            if (z == 2) {
                h[z].name = "Sam";
            }
            System.out.println(h[z].name + " is a ");
            System.out.println("good Hobbit name");
        }
    }
}
