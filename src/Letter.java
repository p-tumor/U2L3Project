public class Letter {


    public void writeLetter(String name) {
        greeting(name);
        specialMessage();
        closing();
    }

    public void greeting(String name) {
        System.out.printf("Hello %s!\n",name);
    }

    public void specialMessage() {
        System.out.println("Java is pretty cool, wouldn’t you say?");
    }

    public void closing() {
        System.out.println("See you later!");

    }
}