public class Teacher {
    String designation = "Lecturer";
    String UNIName = "DIU";

    public void job() {
        System.out.println("Teaching");
    }

}

class CSETeacher extends Teacher {
    String mainsubejct = "CSE";

    public static void main(String args[]) {
        CSETeacher c1 = new CSETeacher();
        System.out.println("Designation: " + c1.designation);
        System.out.println("University Name: " + c1.UNIName);
        System.out.println("Main Subject: " + c1.mainsubejct);
        c1.job();
    }

}
