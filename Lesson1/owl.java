public class owl extends Animal implements Flyable, Illable {
   
    @Override
    public void ill() {
        System.out.println("I am ill");
    }

    @Override
    public void fly() {
        System.out.println("I am flying very well");
    }
}
