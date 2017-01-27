package task3.flowers;

/**
 * Created by Sherlock on 27.01.2017.
 */
public class Flowers {

    private int sremLength;
    private double price;
    private int freshnes;

    protected Flowers( int sremLength, double price, int freshnes) {

        this.sremLength = sremLength;
        this.price = price;
        this.freshnes = freshnes;
    }



    public double getSremLength() {
        return sremLength;
    }

    public void setSremLength(int sremLength) {
        this.sremLength = sremLength;
    }

    public double getPrice() {
        return price;
    }

    public  int getFreshnes() {
        return freshnes;
    }




}
