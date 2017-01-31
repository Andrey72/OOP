package student.model;

import java.util.Arrays;

/**
 * Created by Sherlock on 22.01.2017.
 */
public class University {
    private String universityName;
    private Group[] groups;
    private int countGroup = 0;
    private int size;


    public University(String universityName, int size) {
        this.universityName = universityName;
        this.size = size;
        this.groups = new Group[size];
    }

    public void showGroups() {
        System.out.println(Arrays.toString(groups));
    }

   public Group[] addGroup(Group group){
       if (countGroup == size){
           System.out.println("Group - full");
       }

       else {
           groups[countGroup] = group;
       countGroup++;
       }
       return groups;
   }


}
