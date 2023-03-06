public class School {
    String schName;
    Address schAddress;
    Principal principal;
    StudentData student;

    ListOfSchool newSch = new ListOfSchool();

    public void setSchName(String schName){
        this.schName = schName;
    }

    public void setAddress(Address addr){
        this.schAddress = addr;
    }

    public void setPrincipal(Principal principal){
        this.principal = principal;
    }

    public void setStudent(StudentData student){
        this.student = student;
    }

    public void displaySch(){
        System.out.println("School: " + schName);
        System.out.println("Student: " + student);
    }


}
