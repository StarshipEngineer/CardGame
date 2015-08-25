import java.util.Random;

class Test {
    public static void main(String args[]) {
        int s = 10;
    
        IntDeck i = new IntDeck(s);
        for(int n = 0; n < s; n++){
            i[n] = n;
        }
    
        for(int n = 0; n < s; n++){
            System.out.println(i[n]);
        }
    
        System.out.println();
    
        i.shuffle();
        for(int n = 0; n < s; n++){
            System.out.println(i[n]);
        }
    }
}


class IntDeck {
    /**/
    int size;
    int[] d;
    int getloc, putloc;

    IntDeck(int s) {
          d = new int[s];
          getloc = putloc = 0;
      }

    void shuffle() {
        /**/
        Random r = new Random();
        for(int i = d.length-1; i > 0; i--) {
            int rand = r.nextInt(i);
            int temp = d[i];
            d[i] = d[rand];
            d[rand] = temp;
        }
    }

    void put(int i) {
        if (putloc == d.length) {
            System.out.println(" - Deck is full.");
        }
        // make expandable
        d[putloc++] = i;
    }

    int Draw() {
        if (getloc == putloc) {
            System.out.println(" - Deck is empty.");
            return 0;
        }
        return d[getloc++];
    }
}
