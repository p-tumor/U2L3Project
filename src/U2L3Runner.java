public class U2L3Runner {
    public static void main(String[] args) {
        Box box = new Box(10.5, 12.6, 15.75);

// Use the return value from volume() by storing it in a variable
        double boxVolume = box.volume();
        System.out.println("My box has a volume of " + boxVolume);

// Use the return value from volume() by printing it
        System.out.println("My box has a volume of " + box.volume());

// Call the method without doing anything with the return value
// WILL THE LINE OF CODE BELOW COMPILE/RUN?  Try it!  What happens?
        box.volume();

        double length, width, height;

        length = 5.0;
        width = 10.0;
        height = length;

        Box box1 = new Box(length, width, height);
        Box box2 = new Box(length);
        box1.printDimensions();
        box2.printDimensions();

        String bigger;

        if (box1.volume() > box2.volume())
        {
            bigger = "box1 has greater volume";
        }
        else if (box1.volume() < box2.volume())
        {
            bigger = "box2 has greater volume";
        }
        else
        {
            bigger = "both boxes have equal volume";
        }

        System.out.println(bigger);

        boolean box1sides = box1.anySideLongerThan(length);
        boolean box2sides = box2.anySideLongerThan(length);

        System.out.println("box1 has a side that exceeds " + length + ": " + box1sides);
        System.out.println("box2 has a side that exceeds " + length + ": " + box2sides);

    }
}
