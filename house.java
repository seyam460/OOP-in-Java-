public class house {
    public int window; // instance variable
    public int door; // instance variable

    public void increasedoor(int d) { // instance method
        door = door + d;
        System.out.println("door is increased to " + door);
    }

    public void view() { // instance method
        System.out.println("window is " + window);
        System.out.println("door is " + door);

    }

}
