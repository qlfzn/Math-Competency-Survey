public class Main {
    public static void main(String[] args) {
        School smk1 = new School();

        smk1.setSchName("SMK Taman Utama");

        Principal pcpl = new Principal();

        pcpl.fullName("Tom", "Cruise");
        smk1.setPrincipal(pcpl);

        Address add1 = new Address();

        add1.setStreet("Jalan Bunga Raya");
        add1.setPostcode("56320");
        add1.setCity("Ipoh");
        add1.setState("Perak");

        smk1.setAddress(add1);

        StudentData stud1 = new StudentData();

        stud1.setStudName("Jackson");
        stud1.setId("1001");
        stud1.setClassName("5 Bijak");
        stud1.setStudScore(85);

        smk1.setStudent(stud1);
        smk1.displaySch();















    }
}