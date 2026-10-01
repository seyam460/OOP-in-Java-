public class dog {
    public String name;
 // method overloading
    public void eat (String food) {
        System.out.println(name + " Is eating " + food ); 
    }

    public void eat (String food, int quantity) {
        System.out.println(name + " Is eating " + quantity + " units of " + food ); 
    }


    public void bark () {
        System.out.println(name + " Is Barking");

    }

}
