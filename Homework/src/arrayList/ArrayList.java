package arrayList;

import java.util.Arrays;

/**
 * Created by Sherlock on 02.02.2017.
 */
public class ArrayList {

    private int size = 0  ;
    private Object[] objects;

    public ArrayList( Object[] objects) {

        this.objects = objects;
        while (!(objects[size] == null)) {
            size++;
        }
    }

    public ArrayList(int size) {
        this.size = size;
        this.objects = new Object[size];
    }

    public int getSize() {
        return size;
    }


    public void showList() {
        System.out.println(Arrays.toString(objects));
    }
    public void ensureCapacity(int minCapacity) {
        if (objects.length < minCapacity) {
            Object[] temp = new Object[minCapacity];
            System.arraycopy(objects, 0, temp, 0, size);
            objects = new Object[minCapacity];
            objects = temp;
        }
    }

    public boolean add(Object obj) {
        ensureCapacity(size + 1);
            objects[size++] = obj;

    return true;
    }
    public boolean add(int index , Object obj){
        ensureCapacity(size + 1);
        System.out.println(" Index car - " + index + " Car model - "+ obj  );
        System.arraycopy(objects, index, objects, index + 1,size - index);
      objects[index] = obj;
        return true;
    }

    public Object get(int index){
        if(index < 0 || index >= objects.length){
            return false;
        }
        else{
            return objects[index];
        }
    }

    public  boolean remove(int index) {
        if(index < 0 || index >= objects.length){
            return false;
        }
        else{

            System.arraycopy(objects , index + 1, objects,index , objects.length - index - 1  );
            objects[size--] = null;
        }

        return  true;
    }

    public void set(int index, Object obj) {
        if (index >= 0 && index <= size){
            for ( int i = 0; i < objects.length; i++){
                if (i == index){
                    objects[i] = obj;
                }
            }
        }
    }

    public void delet() {
        for (int i = 0; i < objects.length; i ++){
            objects[i] = null;
        }
        size = 0;
    }

    public boolean contains(Object obj) {
        boolean car2 = false;
        for (int i = 0; i < objects.length; i ++){
            if(obj.equals(objects[i])){
                car2 = true;
            }
        }
    return  car2;
    }
}
