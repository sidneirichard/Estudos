public class Dog {
    String name;
    int size;
    void bark(int numOfBarks){
        if(size > 60){
            System.out.println(name + " Woof! Woof!");
        } else if (size > 14) {
            System.out.println(name + " Ruff! Ruff!");
        } else {
            System.out.println(name + " Yip! Yip!");
        }
    }
    public void eat(){

    }
    public void chaseCat (){

    }



}
