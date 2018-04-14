import java.util.*;

public class Main {

    public static void main(String[] args) {

        int maxSize = 100;
        OrdArray arr;

        arr = new OrdArray(maxSize);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);

        int searchKey = 55;

        if ( arr.find(searchKey) != arr.size() ) {
            System.out.println( "Found " + searchKey );
        } else {
            System.out.println( "Cant find " + searchKey );
        }

        arr.display();

    }
}




