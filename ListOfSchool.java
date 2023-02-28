import java.util.ArrayList;
import java.util.List;

public class ListOfSchool {
    School[] schList = new School[5];
    int index = 0;

    void keepName(School s){
        schList[index] = s;
        index++;
    }

    public static void main(String[] args){
        ListOfSchool newList = new ListOfSchool();
        newList.keepName(new School());
    }






}
