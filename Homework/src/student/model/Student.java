package student.model;

/**
 * Created by Sherlock on 18.12.2016.
 */
public class Student {

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

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }


    public int getmark() {
        return mark;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object student){
        if (student == null || !(student instanceof Student)) return false;
        Student temp = (Student) student;
        if (this == student) return true;
        if (!this.name.equals(temp.name)) return false;
        if (!this.surname.equals(temp.surname)) return false;
        if (this.phone != temp.phone) return false;
        if (this.mark != temp.mark) return false;
        return true;
    }


}


