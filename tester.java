public class tester {
    public static void main(String[] args) {
        // classname variable = new classname();
        Student s1 = new Student(); // object // instance1
        Student s2 = new Student(); // object // instance2
        Student s3 = new Student(); // object // instance3
        s1.name = "rakib";
        s1.id = 101;
        s3.name = "tamim";
        s3.id = 103;
        s1.m1(78);

        System.out.println(s1); // null
        System.out.println(s2); // null
        System.out.println(s3); // null
        System.out.println(s1.name);
        System.out.println(s1.id);
        System.out.println(s2.name);
        System.out.println(s2.id);
        System.out.println(s3.name);
        System.out.println(s3.id);

    }
}
