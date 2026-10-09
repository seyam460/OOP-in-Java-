public class employee {
    float salary = 4000;
}

class programmer extends employee {
    float bonus = 1000;

    public static void main(String args[]) {
        programmer p1 = new programmer();
        System.out.println("Programmer salary is: " + p1.salary);
        System.out.println("Bonus of Programmer is: " + p1.bonus);
    }
}
