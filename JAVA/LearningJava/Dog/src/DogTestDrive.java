public class DogTestDrive {
    public static void main(String[] args) {

        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = new Dog();
        myDogs[0].size = 17;
        myDogs[1].size = 14;
        myDogs[2].size = 77;

        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";
        myDogs[2].name = "Brad";
        System.out.print("last dog's name is ");
        System.out.println(myDogs[2].name);

        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark(2);
            x++;
        }
    }
}

