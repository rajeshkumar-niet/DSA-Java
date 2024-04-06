import java.util.ArrayList;
import java.util.Collections;
// import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<>();
        ArrayList<String> listString = new ArrayList<>();
        // Adding the elemets by add method
        mylist.add(5);
        mylist.add(8);
        System.out.println(mylist);
        listString.add("Sonu");
        listString.add("MONU");
        System.out.println(listString);

        // Getting elemets by get 
        System.out.println(mylist.get(1));

        // add element on a location by index
        mylist.add(2,5);
        System.out.println(mylist);

        // update the value 
        mylist.set(0, 55);
        System.out.println("After updation "+ mylist);

        // remove the element
        // mylist.remove(0);
        System.out.println("After removing "+mylist);

        // Size of arraylist
        System.out.println(mylist.size());

        // Sorting 
        Collections.sort(mylist);
        System.out.println(mylist);
    }
}
