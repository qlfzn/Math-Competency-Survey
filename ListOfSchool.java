import java.util.ArrayList;


public class ListOfSchool {
    School schName;
    ArrayList<School> schList = new ArrayList<School>();

    void keepSch(School sch){
        this.schName = sch;
        schList.add(sch);

    }

    void displaySch(){
        for(int i = 0; i< schList.size(); i++){
            System.out.println(schList.get(i));
        }
    }


    public static void main(String[] args){
        ListOfSchool newList = new ListOfSchool();
        School newSch = new School();

        newSch.setSchName("SMK Taman Jaya");
        newList.keepSch(newSch);

        newList.displaySch();
    }








}
