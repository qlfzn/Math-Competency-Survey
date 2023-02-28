public class Address {
    String street;
    String postcode;
    String city;
    String state;

    School schName = new School();

    public Address() {
        System.out.println("Address for " + schName.schoolName);
    }

    public Address(String street, String postcode, String city, String state) {
        this.street = street;
        this.postcode = postcode;
        this.city = city;
        this.state = state;
    }

}
