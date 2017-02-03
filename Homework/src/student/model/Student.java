package student.model;

/**
 * Created by Sherlock on 18.12.2016.
 */
public class Student implements Comparable {

    private String name;
    private String surname;
    private String phone;
    private int mark;


    public String toString() {
        return String.format("name -  %s,surname - %s,  phone %s, mark - %s",
                name, surname, phone, mark);
    }


    public Student(String name, String surname, String phone, int mark) {

        this.name = name;
        this.phone = phone;
        this.mark = mark;
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getmark() {
        return mark;
    }

    @Override
    public boolean equals(Object student) {
        if (student == null || !(student instanceof Student)) return false;
        Student temp = (Student) student;
        if (this == student) return true;
        if (!this.name.equals(temp.name)) return false;
        if (!this.surname.equals(temp.surname)) return false;
        if (this.phone != temp.phone) return false;
        if (this.mark != temp.mark) return false;
        return true;
    }
    @Override
    public int compareTo(Object object){
        Student temp  = (Student) object;
        return this.surname.compareTo(temp.surname);
    }


}


