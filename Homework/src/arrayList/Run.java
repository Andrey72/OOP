package arrayList;

/**
 * Created by Sherlock on 02.02.2017.
 */
public class Run {
    public static void main(String[] args) {
        ArrayList car = new ArrayList(1);
        System.out.println("add index:");
        car.add("Honda");
        car.add("Mazda");
        car.add("Seat");
        car.add("BMW");

        car.showList();
        System.out.println("Add index and object: ");
        car.add(5, "Audi");
        car.showList();

        System.out.println(car.get(5));
        System.out.println("Remove index:");
        car.remove(0);
        car.showList();
        System.out.println("Set mark car:");
        car.set(5, "Lada");
        car.showList();

        System.out.println(car.contains("Seat"));
        car.showList();
        car.delet();
        car.showList();


    }
}
