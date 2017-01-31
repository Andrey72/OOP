package task4_Interface.Doctor;

/**
 * Created by Sherlock on 28.01.2017.
 */
public class Run {
    public static void main(String[] args) {

        Surgeon neurosurgeon = new Surgeon("Jeson","neurosurgeon", 20) ;
        neurosurgeon.showDoctor();
        System.out.println();
        Surgeon surgeon = new Surgeon("Sem","surgeon", 15) ;
        surgeon.showDoctor();

    }
}