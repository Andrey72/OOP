package task4_Interface.Doctor;

/**
 * Created by Sherlock on 28.01.2017.
 */
public class Surgeon implements Doctor{

    private String name;
    private int exp;
    private String profession;

    public Surgeon(String name,String profession, int exp) {
        this.exp = exp;
        this.name = name;
        this.profession = profession;

    }

    public void showDoctor(){
        System.out.printf("My name -  %s. I'm -  %s, experience in this field - %d year "  , name ,profession, exp );
    }



}
