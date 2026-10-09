public class profile {
    private final String username;
    private String phonenumber;
    private String dropoffpoint;
    private String pickuppoint;

    public profile(String phonenumber, String dropoffpoint, String pickuppoint) {
        username = "ABC";
        this.phonenumber = phonenumber;
        this.dropoffpoint = dropoffpoint;
        this.pickuppoint = pickuppoint;
    }

    public String getusername() {
        return username;
    }

    public void setphonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getphonenumber() {
        return phonenumber;
    }

    public void setpickuppoint(String pickuppoint) {
        this.pickuppoint = pickuppoint;
    }

    public String getpickuppoint() {
        return pickuppoint;
    }

    public void setdropoffpoint(String dropoffpoint) {
        if (!dropoffpoint.equals(this.pickuppoint)) {
            this.dropoffpoint = dropoffpoint;

        } else {
            System.out.println("Drop-off point cannot be the same as pickup point.");
        }
    }

    public String getdropoffpoint() {

        return dropoffpoint;
    }

    public static void main(String[] args) {
        profile myProfile = new profile("01712345678", "Banani", "Dhanmondi");

        System.out.println("Username: " + myProfile.getusername());
        System.out.println("Phone: " + myProfile.getphonenumber());
        System.out.println("Pickup Point: " + myProfile.getpickuppoint());
        System.out.println("Drop-off Point: " + myProfile.getdropoffpoint());

        System.out.println("\n--- Validation Test ---");

        myProfile.setdropoffpoint("Dhanmondi");

        myProfile.setdropoffpoint("Gulshan");
        System.out.println("Updated Drop-off Point: " + myProfile.getdropoffpoint());
    }
}
