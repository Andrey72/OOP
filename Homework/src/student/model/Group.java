package student.model;

import java.util.Arrays;

/**
 * Created by Sherlock on 19.12.2016.
 */
public class Group {

    private String nameGroup;
    private Student[] students;
    private int size;
    private int countStudent = 0;

    public Group(String nameGroup, int size) {
        this.nameGroup = nameGroup;
        this.size = size;
        this.students = new Student[size];
    }

    public Student[] addStudent(Student student) {
        if (countStudent == size) {
            System.out.println("Full group");
        } else {
            students[countStudent] = student;
            countStudent++;
        }
        return students;
    }

    public void deleteStudent(int countStudent) {
        if (countStudent < 0 ||  students.length - 1 < countStudent) {
            System.out.println("Students do not exist");
        }
        else {
            Student[] temp = new Student[students.length - 1];
            System.arraycopy(students, countStudent + 1, temp, 0, temp.length - countStudent);
            System.arraycopy(students, 0, temp, temp.length - countStudent, countStudent);
            students = temp;

        }
    }


    public void showStudents() {
        System.out.println("Group name - " + nameGroup);
        System.out.println(Arrays.toString(students));
    }

    @Override
    public String toString() {
        return String.format("Group name - %s", nameGroup);

    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void searchStudent(String name) {
        System.out.println("student name - " + name + "in group" + nameGroup);
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getName().equals(name)) {
                System.out.println(students[i].toString());
            }
        }
    }

    public Student[] sortStudents() {

        Student temp;
        for (int i = students.length - 1; i > 0; i--)
            for (int j = 0; j < i; j++)
                if (students[j + 1] != null && students[j].getName().compareTo(students[j + 1].getName()) > 0) {
                    temp = students[j + 1];
                    students[j + 1] = students[j];
                    students[j] = temp;
                }
        return students;
    }

}
