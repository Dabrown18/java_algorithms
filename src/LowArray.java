public class LowArray {

    private long[] a; // reference to array a

    public LowArray ( int size ) { // constructor
        a = new long[size];       // create array
    }

    public void setElem ( int index, long value) {
        a[index] = value;         // sets value
    }

    public long getElem ( int index ) {
        return a[index];          // gets value
    }

}
