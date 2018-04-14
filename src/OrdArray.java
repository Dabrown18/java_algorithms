public class OrdArray {

    private long[] a;
    private int nElems;

    public OrdArray( int max ) {
        a = new long[max];
    }

    public int size() {
        return nElems;
    }

    public int find( long searchKey ) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while(true) {
            curIn = ( lowerBound + upperBound ) / 2;

            if ( a[curIn] == searchKey ) {
                return curIn;
            } else if ( lowerBound > upperBound) {
                return nElems;
            } else {
                if ( a[curIn] < searchKey ) {
                    lowerBound = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }

    public boolean delete( long value ) {
        int j = find(value);
        if ( j == nElems ) {
            return false;
        } else {
            for ( int k = j; k < nElems; k++ ) {
                a[k] = a[k + 1];
            }
            nElems--;
            return true;
        }
    }

    public void display( ) {
        for ( int j = 0; j < nElems; j++ ) {
            System.out.println( a[j] + " ");
        }

        System.out.println(" ");
    }
}
