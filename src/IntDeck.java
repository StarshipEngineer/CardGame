import java.util.Random;

class IntDeck {
	  /**/
    int size;
	  int[] d;

    Deck(int s) {
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
