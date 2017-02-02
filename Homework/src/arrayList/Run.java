package arrayList;

/**
 * Created by Sherlock on 02.02.2017.
 */
public class Run {
    public static void main(String[] args) {
        ArrayList car = new ArrayList(1);

        car.add("Honda");
        car.add("Mazda");
        car.add("Seat");
        car.add("BMW");

        car.showList();

        car.add(5, "Audi");
        car.showList();

        System.out.println(car.get(5));
        car.remove(0);
        car.showList();
        car.set(3, "");
        car.showList();

        System.out.println(car.contains("Seat"));
        car.showList();
        car.delet();
        car.showList();


    }
}
