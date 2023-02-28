public class School {
    String schoolName;
    Address address;

    public School(){
        System.out.println("New School");
    }

    public School(String schoolName){
        this.schoolName = schoolName;
        System.out.println(schoolName);
    }


    public void setAddress(Address address) {
        this.address = address;
    }
}
