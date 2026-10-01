public class tester1 {
    public static void main(String[] args) {
        house h1 = new house();
        h1.window = 4;
        h1.door = 2;
        house h2 = new house();
        h2.window = 6;
        h2.door = 3;

        System.out.println("H1--------");
        h1.view();
        System.out.println("H2--------");
        h2.view();
        h1.increasedoor(1);
        h1.view();
        

    }

}
