public class tester2 {
    public static void main(String[] args) {
       mycalculator c1 = new mycalculator();
       // case 01
       c1.add1( 5 ,10);
       System.out.println("========");

       // case 02
       int ans = c1.add1(3 , 4);
    System.out.println(ans);

    // case 03
    System.out.println(c1.add1(4, 6));
    System.out.println("=========");

    // case 04 
    int z = 7 + c1.add1( 2 , 9);
    System.out.println(z);
    
       

        

    }
}
