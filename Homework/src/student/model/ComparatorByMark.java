package student.model;

import java.util.Comparator;

/**
 * Created by Sherlock on 01.02.2017.
 */
public class ComparatorByMark implements Comparator {
    @Override

    public int compare(Object obj1, Object obj2){
        Student st1 = (Student) obj1;
        Student st2 = (Student) obj2;

        return Integer.compare(st1.getmark() , st2.getmark());
    }
}
