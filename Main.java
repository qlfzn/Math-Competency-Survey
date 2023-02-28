public class Main {
    public static void main(String[] args) {
       School sch1 = new School("SMK Ipoh");


       Address add = new Address();
       Address add1 = new Address("Jalan Bunga Raya", "78890", "Bandar Ipoh", "Perak");
       sch1.setAddress(add1);

        StudentData student1 = new StudentData();
        student1.initialStoreMark("Thomas", "001", "5 Bijak", 85);







    }
}