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

    IntDeck(int s) {
          d = new int[s];
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
}
