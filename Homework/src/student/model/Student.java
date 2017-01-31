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
                name, surname,phone, mark);
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

    public void setName(String name) {
        if (name == null || name.isEmpty()) return;
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getmark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getSurname() {
        return surname;
    }
}


