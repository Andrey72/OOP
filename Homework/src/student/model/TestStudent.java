package student.model;

/**
 * Created by Sherlock on 18.12.2016.
 */
public class TestStudent {
    public static void main(String[] args) {


        Student st1 = new Student("Vane", "  Roony ", "+3809312345", 80) ;
        Student st2 = new Student("Zlatan", "Ibrahimovic", "+3809312345", 90);
        Student st3 = new Student("David", "De G", "+3809312345", 95);
        Student st4 = new Student("David", "De Ge", "+3809312345", 95);
        Student st5 = new Student("Harry", "Potter", "+3809312345", 79);
        Student st6 = new Student("Hermiona", "Ibrahimovic", "+3809312345", 50);
        Student st7 = new Student("Ron", "Vizli", "+3809312345", 34);
        Student st8 = new Student("Frodo", "Beginz", "+3809312345", 23);
        Student st9 = new Student("Frodo", "Beginz", "+3809312345", 23);


        Group group1 = new Group("om-21", 6);
        Group group2 = new Group("om-22", 4);
        System.out.println();


        group1.addStudent(st2);
        group1.addStudent(st3);
        group1.addStudent(st4);
        group1.addStudent(st9);
        group1.showStudents();

        System.out.println();

        group2.addStudent(st5);
        group2.addStudent(st6);
        group2.addStudent(st7);
        group2.addStudent(st5);

        group2.showStudents();

        System.out.println();

        System.out.println("Delete student:");
        group1.deleteStudent(9);
        group1.showStudents();

        System.out.println();

        Group[] groups = {group1, group2};
        University university = new University("KPI", 4);

        System.out.println();

        university.addGroup(group1);
        university.addGroup(group2);
        university.showGroups();

        System.out.println();

        System.out.println("search student: ");
        group1.searchStudent("Zlatan");

        System.out.println("---------------------");
        group1.sortStudentsByName();
        group1.showStudents();

        System.out.println("--------------------------");
        group1.sortComparator(new ComparatorByMark());
        System.out.println("Sorted by Mark:");
        group1.showStudents();

        System.out.println("--------------------------");
        group2.sortComparator(new ComparatorByName());
        System.out.println("Sorted by Name:");
        group2.showStudents();


    }

}





