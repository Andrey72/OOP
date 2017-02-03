package student.model;

import java.util.Comparator;

/**
 * Created by Sherlock on 01.02.2017.
 */
public class ComparatorByName implements Comparator{

    @Override
    public int compare(Object o1, Object o2){
        Student st1 = (Student) o1 ;
        Student st2 = (Student) o2;
        return st1.getSurname().compareTo(st2.getSurname());
    }

}
